package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class Payload{

	@SerializedName("data")
	private Data data;

	public Data getData(){
		return data;
	}
}