/*
 Copyright (c) Novedia Group 2012.
 This file is part of Hubiquitus
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 of the Software, and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies
 or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

 You should have received a copy of the MIT License along with Hubiquitus.
 If not, see <http://opensource.org/licenses/mit-license.php>. 

 */



package org.hubiquitus.hubiquitus4j.hgoogleplus;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GPItem extends JSONObject {

	final Logger log = LoggerFactory.getLogger(GPItem.class);

	public GPItem(JSONObject jsonObj) throws JSONException{
		super(jsonObj, JSONObject.getNames(jsonObj));
	}

	public GPItem() throws JSONException{
        super();
	}



	/********************************************************
	 *              The Getters && The Setters 
	 *******************************************************/

	/**
	 * 
	 * @return Published
	 */
	public String getPublished() {
		String result = null;

		if (has("published")) {
			try {
				result = getString("Published");
			} catch (JSONException e) {
				log.error("strange I can't read the Published value ???!!! :(", e);
			}
		}

		return result;		
	}

	/**
	 * Set the Published  of the GPItem.
	 * @param published
	 */
	public void setPublished(String published){
		try {
			this.put("Published", published);
		} catch (JSONException e) {
			log.error("Can't update the published  attribut",e);
		}
	}



	/**
	 * 
	 * @return title
	 */
	public String getTitle() {
		String result = null;

		if (has("title")) {
			try {
				result = getString("title");
			} catch (JSONException e) {
				log.error("strange I can't read the title value ???!!! :(", e);
			}
		}

		return result;		
	}
	/**
	 * Set the Title  of the GPItem.
	 * @param title
	 */
	public void setTitle(String title){
		try {
			this.put("title", title);
		} catch (JSONException e) {
			log.error("Can't update the title  attribut",e);
		}
	}


	/**
	 * 
	 * @return updated
	 */
	public String getUpdated() {
		String result = null;

		if (has("updated")) {
			try {
				result = getString("updated");
			} catch (JSONException e) {
				log.error("strange I can't read the updated value ???!!! :(", e);
			}
		}

		return result;		
	}
	/**
	 * Set the Updated  of the GPItem.
	 * @param updated
	 */
	public void setUpdated(String updated){
		try {
			this.put("updated", updated);
		} catch (JSONException e) {
			log.error("Can't update the updated  attribut",e);
		}
	}


	/**
	 * 
	 * @return diplayname
	 */
	public String getDisplayName() {
		String result = null;

		if (has("displayName")) {
			try {
				result = getString("displayName");
			} catch (JSONException e) {
				log.error("strange I can't read the displayName value ???!!! :(", e);
			}
		}

		return result;		
	}

	/**
	 * Set the displayName  of the GPItem.
	 * @param displayName
	 */	
	public void setDisplayName(String displayName){
		try {
			this.put("displayName", displayName);
		} catch (JSONException e) {
			log.error("Can't update the displayName  attribut",e);
		}
	}

	public String getId() {
		String result = null;

		if (has("id")) {
			try {
				result = getString("id");
			} catch (JSONException e) {
				log.error("strange I can't read the id value ???!!! :(", e);
			}
		}

		return result;		
	}

	/**
	 * Set the id  of the GPItem.
	 * @param id
	 */	
	public void setId(String id){
		try {
			this.put("id", id);
		} catch (JSONException e) {
			log.error("Can't update the id  attribut",e);
		}
	}

	/**
	 * 
	 * @return url
	 */
	public String getUrl() {
		String result = null;

		if (has("url")) {
			try {
				result = getString("url");
			} catch (JSONException e) {
				log.error("strange I can't read the url value ???!!! :(", e);
			}
		}

		return result;		
	}

	/**
	 * Set the url  of the GPItem.
	 * @param url
	 */	
	public void setUrl(String url){
		try {
			this.put("url", url);
		} catch (JSONException e) {
			log.error("Can't update the url  attribut",e);
		}
	}

	/**
	 * 
	 * @return imageUrl
	 */
	public String getImage() {
		String result = null;

		if (has("image")) {
			try {
				result = getString("image");
			} catch (JSONException e) {
				log.error("strange I can't read the image value ???!!! :(", e);
			}
		}

		return result;		
	}

	/**
	 * Set the image  of the GPItem.
	 * @param image
	 */	
	public void setImage(String image){
		try {
			this.put("image", image);
		} catch (JSONException e) {
			log.error("Can't update the image  attribut",e);
		}
	}

	/**
	 * 
	 * @return content
	 */
	public String getContent() {
		String result = null;

		if (has("content")) {
			try {
				result = getString("content");
			} catch (JSONException e) {
				log.error("strange I can't read the content value ???!!! :(", e);
			}
		}

		return result;		
	}
	/**
	 * Set the content  of the GPItem.
	 * @param content
	 */	
	public void setContent(String content){
		try {
			this.put("content", content);
		} catch (JSONException e) {
			log.error("Can't update the content  attribut",e);
		}
	}

	/**
	 * 
	 * @return attachement
	 */
	public JSONArray getAttachments() {
		JSONArray result = null;

		if (has("attachments")) {
			try {
				result = getJSONArray("attachments");
			} catch (JSONException e) {
				log.error("strange I can't read the attachments value ???!!! :(", e);
			}
		}

		return result;		
	}
	/**
	 * Set the displayName  of the GPItem.
	 * @param attachments
	 */	
	public void setAttachments(JSONArray attachments){
		try {
			this.put("attachments", attachments);
		} catch (JSONException e) {
			log.error("Can't update the attachments  attribut",e);
		}
	}
	
	/**
	 * 
	 * @return content
	 */
	public String getActorUrl() {
		String result = null;

		if (has("ActorUrl")) {
			try {
				result = getString("ActorUrl");
			} catch (JSONException e) {
				log.error("strange I can't read the content value ???!!! :(", e);
			}
		}

		return result;		
	}
	/**
	 * Set the content  of the GPItem.
	 * @param actorUrl
	 */	
	public void setActorUrl(String actorUrl){
		try {
			this.put("actorUrl", actorUrl);
		} catch (JSONException e) {
			log.error("Can't update the actorUrl  attribut",e);
		}
	}
	/**
	 * 
	 * @return ActorId
	 */
	public String getActorId() {
		String result = null;

		if (has("actorId")) {
			try {
				result = getString("actorId");
			} catch (JSONException e) {
				log.error("strange I can't read the actorId value ???!!! :(", e);
			}
		}
		return result;		
	}
	/**
	 * Set the content  of the GPItem.
	 * @param actorId
	 */	
	public void setActorId(String actorId){
		try {
			this.put("actorId", actorId);
		} catch (JSONException e) {
			log.error("Can't update the actorId  attribut",e);
		}
	}
	
	
	
}
