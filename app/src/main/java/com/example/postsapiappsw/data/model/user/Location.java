package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("lng")
	private double lng;

	@SerializedName("lat")
	private double lat;

	public double getLng(){
		return lng;
	}

	public double getLat(){
		return lat;
	}
}