package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class FeeAdmin{

	@SerializedName("stripe")
	private String stripe;

	@SerializedName("ovo")
	private String ovo;

	public void setStripe(String stripe){
		this.stripe = stripe;
	}

	public String getStripe(){
		return stripe;
	}

	public void setOvo(String ovo){
		this.ovo = ovo;
	}

	public String getOvo(){
		return ovo;
	}

	@Override
 	public String toString(){
		return 
			"FeeAdmin{" + 
			"stripe = '" + stripe + '\'' + 
			",ovo = '" + ovo + '\'' + 
			"}";
		}
}