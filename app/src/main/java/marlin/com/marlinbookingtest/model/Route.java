package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class Route{

	@SerializedName("operation_hours")
	private String operationHours;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("availability")
	private int availability;

	@SerializedName("city_from")
	private String cityFrom;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("category_id")
	private int categoryId;

	@SerializedName("port_to")
	private String portTo;

	@SerializedName("port_from_code")
	private String portFromCode;

	@SerializedName("id")
	private int id;

	@SerializedName("country_from")
	private CountryFrom countryFrom;

	@SerializedName("port_to_code")
	private String portToCode;

	@SerializedName("is_international")
	private int isInternational;

	@SerializedName("sort_order")
	private int sortOrder;

	@SerializedName("country_to")
	private CountryTo countryTo;

	@SerializedName("port_from")
	private String portFrom;

	@SerializedName("city_to")
	private String cityTo;

	@SerializedName("status")
	private int status;

	public void setOperationHours(String operationHours){
		this.operationHours = operationHours;
	}

	public String getOperationHours(){
		return operationHours;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setAvailability(int availability){
		this.availability = availability;
	}

	public int getAvailability(){
		return availability;
	}

	public void setCityFrom(String cityFrom){
		this.cityFrom = cityFrom;
	}

	public String getCityFrom(){
		return cityFrom;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setPortTo(String portTo){
		this.portTo = portTo;
	}

	public String getPortTo(){
		return portTo;
	}

	public void setPortFromCode(String portFromCode){
		this.portFromCode = portFromCode;
	}

	public String getPortFromCode(){
		return portFromCode;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCountryFrom(CountryFrom countryFrom){
		this.countryFrom = countryFrom;
	}

	public CountryFrom getCountryFrom(){
		return countryFrom;
	}

	public void setPortToCode(String portToCode){
		this.portToCode = portToCode;
	}

	public String getPortToCode(){
		return portToCode;
	}

	public void setIsInternational(int isInternational){
		this.isInternational = isInternational;
	}

	public int getIsInternational(){
		return isInternational;
	}

	public void setSortOrder(int sortOrder){
		this.sortOrder = sortOrder;
	}

	public int getSortOrder(){
		return sortOrder;
	}

	public void setCountryTo(CountryTo countryTo){
		this.countryTo = countryTo;
	}

	public CountryTo getCountryTo(){
		return countryTo;
	}

	public void setPortFrom(String portFrom){
		this.portFrom = portFrom;
	}

	public String getPortFrom(){
		return portFrom;
	}

	public void setCityTo(String cityTo){
		this.cityTo = cityTo;
	}

	public String getCityTo(){
		return cityTo;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Route{" + 
			"operation_hours = '" + operationHours + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",availability = '" + availability + '\'' + 
			",city_from = '" + cityFrom + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",port_to = '" + portTo + '\'' + 
			",port_from_code = '" + portFromCode + '\'' + 
			",id = '" + id + '\'' + 
			",country_from = '" + countryFrom + '\'' + 
			",port_to_code = '" + portToCode + '\'' + 
			",is_international = '" + isInternational + '\'' + 
			",sort_order = '" + sortOrder + '\'' + 
			",country_to = '" + countryTo + '\'' + 
			",port_from = '" + portFrom + '\'' + 
			",city_to = '" + cityTo + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}