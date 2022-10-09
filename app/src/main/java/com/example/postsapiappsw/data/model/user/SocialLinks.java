package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class SocialLinks{

	@SerializedName("website")
	private Object website;

	@SerializedName("facebook_link")
	private String facebookLink;

	@SerializedName("instagram_link")
	private Object instagramLink;

	@SerializedName("linkedin_link")
	private Object linkedinLink;

	public Object getWebsite(){
		return website;
	}

	public String getFacebookLink(){
		return facebookLink;
	}

	public Object getInstagramLink(){
		return instagramLink;
	}

	public Object getLinkedinLink(){
		return linkedinLink;
	}
}