package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class En{

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private Object description;

	@SerializedName("address")
	private String address;

	public String getName(){
		return name;
	}

	public Object getDescription(){
		return description;
	}

	public String getAddress(){
		return address;
	}
}