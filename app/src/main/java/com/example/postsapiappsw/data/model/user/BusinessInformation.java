package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class BusinessInformation{

	@SerializedName("licence_expiry_date")
	private String licenceExpiryDate;

	@SerializedName("licence")
	private String licence;

	@SerializedName("licence_number")
	private String licenceNumber;

	@SerializedName("licence_issue_date")
	private String licenceIssueDate;

	public String getLicenceExpiryDate(){
		return licenceExpiryDate;
	}

	public String getLicence(){
		return licence;
	}

	public String getLicenceNumber(){
		return licenceNumber;
	}

	public String getLicenceIssueDate(){
		return licenceIssueDate;
	}
}