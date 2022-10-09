package com.example.postsapiappsw.data.model.user;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Store{

	@SerializedName("user_review")
	private Object userReview;

	@SerializedName("social_links")
	private SocialLinks socialLinks;

	@SerializedName("rating")
	private double rating;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("customers_count")
	private int customersCount;

	@SerializedName("customers_count_formatted")
	private String customersCountFormatted;

	@SerializedName("vat_information")
	private VatInformation vatInformation;

	@SerializedName("basic_information")
	private BasicInformation basicInformation;

	@SerializedName("id")
	private int id;

	@SerializedName("categories")
	private List<CategoriesItem> categories;

	@SerializedName("reviewed_by_user")
	private boolean reviewedByUser;

	@SerializedName("bank_account")
	private BankAccount bankAccount;

	@SerializedName("info")
	private Info info;

	@SerializedName("status_bg_color")
	private String statusBgColor;

	@SerializedName("followers_count_formatted")
	private String followersCountFormatted;

	@SerializedName("business_information")
	private BusinessInformation businessInformation;

	@SerializedName("completed")
	private boolean completed;

	@SerializedName("liked_by_user")
	private boolean likedByUser;

	@SerializedName("likes_count")
	private int likesCount;

	@SerializedName("latest_feedback")
	private Object latestFeedback;

	@SerializedName("followers_count")
	private int followersCount;

	@SerializedName("likes_count_formatted")
	private String likesCountFormatted;

	@SerializedName("is_following")
	private boolean isFollowing;

	@SerializedName("status")
	private String status;

	@SerializedName("status_text_color")
	private String statusTextColor;

	public Object getUserReview(){
		return userReview;
	}

	public SocialLinks getSocialLinks(){
		return socialLinks;
	}

	public double getRating(){
		return rating;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getCustomersCount(){
		return customersCount;
	}

	public String getCustomersCountFormatted(){
		return customersCountFormatted;
	}

	public VatInformation getVatInformation(){
		return vatInformation;
	}

	public BasicInformation getBasicInformation(){
		return basicInformation;
	}

	public int getId(){
		return id;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	public boolean isReviewedByUser(){
		return reviewedByUser;
	}

	public BankAccount getBankAccount(){
		return bankAccount;
	}

	public Info getInfo(){
		return info;
	}

	public String getStatusBgColor(){
		return statusBgColor;
	}

	public String getFollowersCountFormatted(){
		return followersCountFormatted;
	}

	public BusinessInformation getBusinessInformation(){
		return businessInformation;
	}

	public boolean isCompleted(){
		return completed;
	}

	public boolean isLikedByUser(){
		return likedByUser;
	}

	public int getLikesCount(){
		return likesCount;
	}

	public Object getLatestFeedback(){
		return latestFeedback;
	}

	public int getFollowersCount(){
		return followersCount;
	}

	public String getLikesCountFormatted(){
		return likesCountFormatted;
	}

	public boolean isIsFollowing(){
		return isFollowing;
	}

	public String getStatus(){
		return status;
	}

	public String getStatusTextColor(){
		return statusTextColor;
	}
}