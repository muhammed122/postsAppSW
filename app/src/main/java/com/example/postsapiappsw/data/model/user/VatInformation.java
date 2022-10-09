package com.example.postsapiappsw.data.model.user;

import com.example.postsapiappsw.data.model.user.Ar;
import com.example.postsapiappsw.data.model.user.En;
import com.google.gson.annotations.SerializedName;

public class VatInformation{

	@SerializedName("ar")
	private Ar ar;

	@SerializedName("address")
	private String address;

	@SerializedName("vat_expiration_date")
	private Object vatExpirationDate;

	@SerializedName("vat_registration_status")
	private String vatRegistrationStatus;

	@SerializedName("en")
	private En en;

	@SerializedName("vat_proof_document")
	private String vatProofDocument;

	public Ar getAr(){
		return ar;
	}

	public String getAddress(){
		return address;
	}

	public Object getVatExpirationDate(){
		return vatExpirationDate;
	}

	public String getVatRegistrationStatus(){
		return vatRegistrationStatus;
	}

	public En getEn(){
		return en;
	}

	public String getVatProofDocument(){
		return vatProofDocument;
	}
}