package com.example.postsapiappsw.data.model.user;

import com.google.gson.annotations.SerializedName;

public class AddressesItem{

	@SerializedName("area")
	private Object area;

	@SerializedName("country")
	private Country country;

	@SerializedName("apartment_number")
	private String apartmentNumber;

	@SerializedName("lng")
	private double lng;

	@SerializedName("city")
	private City city;

	@SerializedName("mobile")
	private Object mobile;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("block_number")
	private String blockNumber;

	@SerializedName("floor_number")
	private String floorNumber;

	@SerializedName("street_name")
	private String streetName;

	@SerializedName("default")
	private boolean jsonMemberDefault;

	@SerializedName("governorate")
	private Governorate governorate;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private String location;

	@SerializedName("id")
	private int id;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("lat")
	private double lat;

	@SerializedName("building_type")
	private BuildingType buildingType;

	public Object getArea(){
		return area;
	}

	public Country getCountry(){
		return country;
	}

	public String getApartmentNumber(){
		return apartmentNumber;
	}

	public double getLng(){
		return lng;
	}

	public City getCity(){
		return city;
	}

	public Object getMobile(){
		return mobile;
	}

	public String getLastName(){
		return lastName;
	}

	public String getBlockNumber(){
		return blockNumber;
	}

	public String getFloorNumber(){
		return floorNumber;
	}

	public String getStreetName(){
		return streetName;
	}

	public boolean isJsonMemberDefault(){
		return jsonMemberDefault;
	}

	public Governorate getGovernorate(){
		return governorate;
	}

	public String getName(){
		return name;
	}

	public String getLocation(){
		return location;
	}

	public int getId(){
		return id;
	}

	public String getFirstName(){
		return firstName;
	}

	public double getLat(){
		return lat;
	}

	public BuildingType getBuildingType(){
		return buildingType;
	}
}