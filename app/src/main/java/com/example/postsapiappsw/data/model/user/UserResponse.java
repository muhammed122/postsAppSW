package com.example.postsapiappsw.data.model.user;

import com.example.postsapiappsw.data.model.user.Payload;
import com.google.gson.annotations.SerializedName;

public class UserResponse{

	@SerializedName("payload")
	private Payload payload;

	@SerializedName("error")
	private int error;

	@SerializedName("message")
	private String message;

	public Payload getPayload(){
		return payload;
	}

	public int getError(){
		return error;
	}

	public String getMessage(){
		return message;
	}
}