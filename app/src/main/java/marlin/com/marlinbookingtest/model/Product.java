package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("image")
	private String image;

	@SerializedName("company_id")
	private int companyId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("logo_url")
	private String logoUrl;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("logo")
	private String logo;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("company")
	private Company company;

	@SerializedName("id")
	private int id;

	@SerializedName("sort_order")
	private int sortOrder;

	@SerializedName("tags")
	private String tags;

	@SerializedName("status")
	private int status;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCompanyId(int companyId){
		this.companyId = companyId;
	}

	public int getCompanyId(){
		return companyId;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setLogoUrl(String logoUrl){
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSortOrder(int sortOrder){
		this.sortOrder = sortOrder;
	}

	public int getSortOrder(){
		return sortOrder;
	}

	public void setTags(String tags){
		this.tags = tags;
	}

	public String getTags(){
		return tags;
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
			"Product{" + 
			"image = '" + image + '\'' + 
			",company_id = '" + companyId + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",logo_url = '" + logoUrl + '\'' + 
			",image_url = '" + imageUrl + '\'' + 
			",logo = '" + logo + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",company = '" + company + '\'' + 
			",id = '" + id + '\'' + 
			",sort_order = '" + sortOrder + '\'' + 
			",tags = '" + tags + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}