package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class JsonMember20Item{

	@SerializedName("price_kid")
	private String priceKid;

	@SerializedName("note")
	private String note;

	@SerializedName("for_open")
	private int forOpen;

	@SerializedName("route_id")
	private int routeId;

	@SerializedName("number_of_seat")
	private Object numberOfSeat;

	@SerializedName("fee_admin")
	private FeeAdmin feeAdmin;

	@SerializedName("tax_status")
	private String taxStatus;

	@SerializedName("weekend_starting_price")
	private String weekendStartingPrice;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("price_infant")
	private String priceInfant;

	@SerializedName("weekend_price_kid")
	private String weekendPriceKid;

	@SerializedName("duration")
	private String duration;

	@SerializedName("extra_note")
	private String extraNote;

	@SerializedName("category_id")
	private Object categoryId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("starting_price")
	private String startingPrice;

	@SerializedName("product_id")
	private int productId;

	@SerializedName("bracket")
	private Bracket bracket;

	@SerializedName("id")
	private int id;

	@SerializedName("weekend_price_infant")
	private String weekendPriceInfant;

	@SerializedName("sort_order")
	private int sortOrder;

	@SerializedName("bracket_id")
	private int bracketId;

	@SerializedName("product")
	private Product product;

	@SerializedName("price_adult")
	private String priceAdult;

	@SerializedName("free_adult")
	private int freeAdult;

	@SerializedName("route")
	private Route route;

	@SerializedName("nationality")
	private int nationality;

	@SerializedName("is_two_ways")
	private int isTwoWays;

	@SerializedName("for_booking")
	private int forBooking;

	@SerializedName("weekend_price_adult")
	private String weekendPriceAdult;

	@SerializedName("is_open_return")
	private int isOpenReturn;

	@SerializedName("category")
	private Object category;

	@SerializedName("currency_id")
	private Object currencyId;

	@SerializedName("status")
	private int status;

	public void setPriceKid(String priceKid){
		this.priceKid = priceKid;
	}

	public String getPriceKid(){
		return priceKid;
	}

	public void setNote(String note){
		this.note = note;
	}

	public String getNote(){
		return note;
	}

	public void setForOpen(int forOpen){
		this.forOpen = forOpen;
	}

	public int getForOpen(){
		return forOpen;
	}

	public void setRouteId(int routeId){
		this.routeId = routeId;
	}

	public int getRouteId(){
		return routeId;
	}

	public void setNumberOfSeat(Object numberOfSeat){
		this.numberOfSeat = numberOfSeat;
	}

	public Object getNumberOfSeat(){
		return numberOfSeat;
	}

	public void setFeeAdmin(FeeAdmin feeAdmin){
		this.feeAdmin = feeAdmin;
	}

	public FeeAdmin getFeeAdmin(){
		return feeAdmin;
	}

	public void setTaxStatus(String taxStatus){
		this.taxStatus = taxStatus;
	}

	public String getTaxStatus(){
		return taxStatus;
	}

	public void setWeekendStartingPrice(String weekendStartingPrice){
		this.weekendStartingPrice = weekendStartingPrice;
	}

	public String getWeekendStartingPrice(){
		return weekendStartingPrice;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setPriceInfant(String priceInfant){
		this.priceInfant = priceInfant;
	}

	public String getPriceInfant(){
		return priceInfant;
	}

	public void setWeekendPriceKid(String weekendPriceKid){
		this.weekendPriceKid = weekendPriceKid;
	}

	public String getWeekendPriceKid(){
		return weekendPriceKid;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setExtraNote(String extraNote){
		this.extraNote = extraNote;
	}

	public String getExtraNote(){
		return extraNote;
	}

	public void setCategoryId(Object categoryId){
		this.categoryId = categoryId;
	}

	public Object getCategoryId(){
		return categoryId;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setStartingPrice(String startingPrice){
		this.startingPrice = startingPrice;
	}

	public String getStartingPrice(){
		return startingPrice;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}

	public void setBracket(Bracket bracket){
		this.bracket = bracket;
	}

	public Bracket getBracket(){
		return bracket;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setWeekendPriceInfant(String weekendPriceInfant){
		this.weekendPriceInfant = weekendPriceInfant;
	}

	public String getWeekendPriceInfant(){
		return weekendPriceInfant;
	}

	public void setSortOrder(int sortOrder){
		this.sortOrder = sortOrder;
	}

	public int getSortOrder(){
		return sortOrder;
	}

	public void setBracketId(int bracketId){
		this.bracketId = bracketId;
	}

	public int getBracketId(){
		return bracketId;
	}

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setPriceAdult(String priceAdult){
		this.priceAdult = priceAdult;
	}

	public String getPriceAdult(){
		return priceAdult;
	}

	public void setFreeAdult(int freeAdult){
		this.freeAdult = freeAdult;
	}

	public int getFreeAdult(){
		return freeAdult;
	}

	public void setRoute(Route route){
		this.route = route;
	}

	public Route getRoute(){
		return route;
	}

	public void setNationality(int nationality){
		this.nationality = nationality;
	}

	public int getNationality(){
		return nationality;
	}

	public void setIsTwoWays(int isTwoWays){
		this.isTwoWays = isTwoWays;
	}

	public int getIsTwoWays(){
		return isTwoWays;
	}

	public void setForBooking(int forBooking){
		this.forBooking = forBooking;
	}

	public int getForBooking(){
		return forBooking;
	}

	public void setWeekendPriceAdult(String weekendPriceAdult){
		this.weekendPriceAdult = weekendPriceAdult;
	}

	public String getWeekendPriceAdult(){
		return weekendPriceAdult;
	}

	public void setIsOpenReturn(int isOpenReturn){
		this.isOpenReturn = isOpenReturn;
	}

	public int getIsOpenReturn(){
		return isOpenReturn;
	}

	public void setCategory(Object category){
		this.category = category;
	}

	public Object getCategory(){
		return category;
	}

	public void setCurrencyId(Object currencyId){
		this.currencyId = currencyId;
	}

	public Object getCurrencyId(){
		return currencyId;
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
			"JsonMember20Item{" + 
			"price_kid = '" + priceKid + '\'' + 
			",note = '" + note + '\'' + 
			",for_open = '" + forOpen + '\'' + 
			",route_id = '" + routeId + '\'' + 
			",number_of_seat = '" + numberOfSeat + '\'' + 
			",fee_admin = '" + feeAdmin + '\'' + 
			",tax_status = '" + taxStatus + '\'' + 
			",weekend_starting_price = '" + weekendStartingPrice + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",price_infant = '" + priceInfant + '\'' + 
			",weekend_price_kid = '" + weekendPriceKid + '\'' + 
			",duration = '" + duration + '\'' + 
			",extra_note = '" + extraNote + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",starting_price = '" + startingPrice + '\'' + 
			",product_id = '" + productId + '\'' + 
			",bracket = '" + bracket + '\'' + 
			",id = '" + id + '\'' + 
			",weekend_price_infant = '" + weekendPriceInfant + '\'' + 
			",sort_order = '" + sortOrder + '\'' + 
			",bracket_id = '" + bracketId + '\'' + 
			",product = '" + product + '\'' + 
			",price_adult = '" + priceAdult + '\'' + 
			",free_adult = '" + freeAdult + '\'' + 
			",route = '" + route + '\'' + 
			",nationality = '" + nationality + '\'' + 
			",is_two_ways = '" + isTwoWays + '\'' + 
			",for_booking = '" + forBooking + '\'' + 
			",weekend_price_adult = '" + weekendPriceAdult + '\'' + 
			",is_open_return = '" + isOpenReturn + '\'' + 
			",category = '" + category + '\'' + 
			",currency_id = '" + currencyId + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}