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

package org.hubiquitus.hubotsdk.adapters.HHttpAdapter;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.hubiquitus.hapi.hStructures.HJsonObj;
import org.json.JSONException;
import org.json.JSONObject;

public class HHttpAttachement implements HJsonObj {

	private static Logger logger = Logger.getLogger(HHttpAttachement.class);
	
	private String name = null;
	private byte[] data = null;
	private String contentType = null;

	public HHttpAttachement() {};
	
	public HHttpAttachement(JSONObject jsonObj){
		fromJSON(jsonObj);
	}
	
	/* HJsonObj interface */
	public JSONObject toJSON() {
		JSONObject jsonObj = new JSONObject();
		try {
			jsonObj.put("name", getName());
			jsonObj.put("contentType", getContentType());
			jsonObj.put("data", Base64.encodeBase64(getData()));
		} catch (JSONException e) {
			logger.error(e.toString());
		}
		
		return jsonObj;
	}
	
	public void fromJSON(JSONObject jsonObj) {
		if (jsonObj != null) {
			try {
				setName(jsonObj.getString("name"));
			} catch (JSONException e) {
				logger.error(e.toString());
			}
			
			try {
				setContentType(jsonObj.getString("contentType"));
			} catch (JSONException e) {
				logger.error(e.toString());
			}
			
			try {
				String dataEncoded = jsonObj.getString("data");
				if (dataEncoded != null) {
					setData(Base64.decodeBase64(dataEncoded));
				} else {
					setData(null);
				}
			} catch (JSONException e) {
				logger.error(e.toString());
			}
		}
	}
	
	public String getHType() {
		return "hhttpattachement";
	}
	
	/* getters and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public String toString() {
		return "HHttpAttachement [name=" + name + ", data="
				+ Arrays.toString(data) + ", contentType=" + contentType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + Arrays.hashCode(data);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HHttpAttachement other = (HHttpAttachement) obj;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (!Arrays.equals(data, other.data))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
