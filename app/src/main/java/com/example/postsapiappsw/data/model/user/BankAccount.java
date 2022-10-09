package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class BankAccount{

	@SerializedName("proof_document")
	private String proofDocument;

	@SerializedName("beneficiary_name")
	private String beneficiaryName;

	@SerializedName("payment_mode")
	private String paymentMode;

	@SerializedName("bank")
	private Bank bank;

	@SerializedName("bank_account_number")
	private String bankAccountNumber;

	@SerializedName("iban_code")
	private String ibanCode;

	public String getProofDocument(){
		return proofDocument;
	}

	public String getBeneficiaryName(){
		return beneficiaryName;
	}

	public String getPaymentMode(){
		return paymentMode;
	}

	public Bank getBank(){
		return bank;
	}

	public String getBankAccountNumber(){
		return bankAccountNumber;
	}

	public String getIbanCode(){
		return ibanCode;
	}
}