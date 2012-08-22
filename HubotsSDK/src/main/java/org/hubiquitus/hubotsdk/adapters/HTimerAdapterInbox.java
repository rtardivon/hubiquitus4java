/*
 * Copyright (c) Novedia Group 2012.
 *
 *     This file is part of Hubiquitus.
 *
 *     Hubiquitus is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Hubiquitus is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Hubiquitus.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.hubiquitus.hubotsdk.adapters;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;
import org.hubiquitus.hapi.hStructures.HAlert;
import org.hubiquitus.hapi.hStructures.HMessage;
import org.hubiquitus.hubotsdk.AdapterInbox;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.TriggerBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.JobBuilder.newJob; 

public class HTimerAdapterInbox extends AdapterInbox{

	private static Logger logger = Logger.getLogger(HTimerAdapterInbox.class);
	
	private String mode;
	private String crontab;
	private int period;
	
	private Scheduler scheduler = null;
	private Timer timer = null;
	
	public HTimerAdapterInbox() {}
	
	
	
	public HTimerAdapterInbox(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		//Timer using millisecond
		if(mode.equalsIgnoreCase("millisecond"))
		{
			if(period < 0) {
				final HMessage timerMessage = new HMessage();
				timerMessage.setAuthor(name);
				timerMessage.setType("hAlert");
				HAlert halert = new HAlert();
				halert.setAlert(name);
				timerMessage.setPayload(halert);
				
				timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask() {
			        public void run() {
			           put(timerMessage);
			        }
			    }, 0, period);
			} else {
				logger.error("crontab malformat");
			}
		}
		//Timer using crontab
		if(mode.equalsIgnoreCase("crontab")) {
			try {
				SchedulerFactory sf = new StdSchedulerFactory();
				scheduler = sf.getScheduler();
				
				// define the job and tie it to the TimerClass
				JobDetail job = newJob(TimerClass.class)
				    .withIdentity("timerJob", "group1")
				    .build();
	
				// Trigger the job to run now and use the crontab
				Trigger trigger = newTrigger()
				    .withIdentity("trigger1", "group1")
				    .startNow()
				    .withSchedule(cronSchedule(crontab))
				    .build();
	
				// Tell quartz to schedule the job using our trigger
				scheduler.scheduleJob(job, trigger);
			} catch (Exception e) {
				logger.equals(e.toString());
			}
		}
	}
	
	@Override
	public void stop() {
		if(mode.equalsIgnoreCase("crontab") && scheduler != null) {
			try {
				scheduler.shutdown();
			} catch (SchedulerException e) {
				logger.error(e.toString());
			}
		}
		if(mode.equalsIgnoreCase("millisecond") && timer != null) {
			timer.cancel();
		}
	}


	@Override
	public void setProperties(Map<String,String> params) {	
		if(params != null) {
			if( params.containsKey("mode"))
				this.mode = params.get("mode");
			if( params.containsKey("crontab"))
				this.crontab = params.get("crontab");
			if( params.containsKey("period"))
				this.period = Integer.parseInt(params.get("period"));
			
		}
	}
	
	private class TimerClass implements Job {
		@Override
		public void execute(JobExecutionContext context)
				throws JobExecutionException {
			final HMessage timerMessage = new HMessage();
			timerMessage.setAuthor(name);
			timerMessage.setType("hAlert");
			HAlert halert = new HAlert();
			halert.setAlert("TimeOut : " + name);
			timerMessage.setPayload(halert);
			put(timerMessage);
		}
	}
	
}
