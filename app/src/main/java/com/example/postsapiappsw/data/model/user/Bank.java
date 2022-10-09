package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class Bank{

	@SerializedName("country")
	private Object country;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public Object getCountry(){
		return country;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}