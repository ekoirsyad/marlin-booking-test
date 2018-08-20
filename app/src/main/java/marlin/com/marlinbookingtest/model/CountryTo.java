package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class CountryTo{

	@SerializedName("image")
	private String image;

	@SerializedName("numeric_code")
	private String numericCode;

	@SerializedName("logo_url")
	private String logoUrl;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private String logo;

	@SerializedName("id")
	private int id;

	@SerializedName("second_iso_code")
	private String secondIsoCode;

	@SerializedName("iso_code")
	private String isoCode;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setNumericCode(String numericCode){
		this.numericCode = numericCode;
	}

	public String getNumericCode(){
		return numericCode;
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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSecondIsoCode(String secondIsoCode){
		this.secondIsoCode = secondIsoCode;
	}

	public String getSecondIsoCode(){
		return secondIsoCode;
	}

	public void setIsoCode(String isoCode){
		this.isoCode = isoCode;
	}

	public String getIsoCode(){
		return isoCode;
	}

	@Override
 	public String toString(){
		return 
			"CountryTo{" + 
			"image = '" + image + '\'' + 
			",numeric_code = '" + numericCode + '\'' + 
			",logo_url = '" + logoUrl + '\'' + 
			",image_url = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",logo = '" + logo + '\'' + 
			",id = '" + id + '\'' + 
			",second_iso_code = '" + secondIsoCode + '\'' + 
			",iso_code = '" + isoCode + '\'' + 
			"}";
		}
}