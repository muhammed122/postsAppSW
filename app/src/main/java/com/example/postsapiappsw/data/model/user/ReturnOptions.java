package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class ReturnOptions{

	@SerializedName("icon")
	private String icon;

	@SerializedName("value")
	private Object value;

	public String getIcon(){
		return icon;
	}

	public Object getValue(){
		return value;
	}
}