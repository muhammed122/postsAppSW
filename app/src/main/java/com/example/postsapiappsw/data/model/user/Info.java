package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class Info{

	@SerializedName("return_options")
	private ReturnOptions returnOptions;

	@SerializedName("shipping_information")
	private ShippingInformation shippingInformation;

	@SerializedName("privacy_information")
	private PrivacyInformation privacyInformation;

	public ReturnOptions getReturnOptions(){
		return returnOptions;
	}

	public ShippingInformation getShippingInformation(){
		return shippingInformation;
	}

	public PrivacyInformation getPrivacyInformation(){
		return privacyInformation;
	}
}