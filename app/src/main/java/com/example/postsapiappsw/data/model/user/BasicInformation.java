package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class BasicInformation{

	@SerializedName("financial_email_verified")
	private boolean financialEmailVerified;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("description")
	private Object description;

	@SerializedName("en")
	private En en;

	@SerializedName("financial_email")
	private String financialEmail;

	@SerializedName("business_email_verified")
	private boolean businessEmailVerified;

	@SerializedName("cover")
	private String cover;

	@SerializedName("ar")
	private Ar ar;

	@SerializedName("business_email_equals_financial_email")
	private boolean businessEmailEqualsFinancialEmail;

	@SerializedName("mobile_verified")
	private boolean mobileVerified;

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private String logo;

	@SerializedName("business_email")
	private String businessEmail;

	@SerializedName("legal_name")
	private Object legalName;

	@SerializedName("mobile_verified_via")
	private Object mobileVerifiedVia;

	public boolean isFinancialEmailVerified(){
		return financialEmailVerified;
	}

	public String getMobile(){
		return mobile;
	}

	public Object getDescription(){
		return description;
	}

	public En getEn(){
		return en;
	}

	public String getFinancialEmail(){
		return financialEmail;
	}

	public boolean isBusinessEmailVerified(){
		return businessEmailVerified;
	}

	public String getCover(){
		return cover;
	}

	public Ar getAr(){
		return ar;
	}

	public boolean isBusinessEmailEqualsFinancialEmail(){
		return businessEmailEqualsFinancialEmail;
	}

	public boolean isMobileVerified(){
		return mobileVerified;
	}

	public String getName(){
		return name;
	}

	public String getLogo(){
		return logo;
	}

	public String getBusinessEmail(){
		return businessEmail;
	}

	public Object getLegalName(){
		return legalName;
	}

	public Object getMobileVerifiedVia(){
		return mobileVerifiedVia;
	}
}