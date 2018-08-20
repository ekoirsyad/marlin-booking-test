package marlin.com.marlinbookingtest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BatamSingapore{

	@SerializedName("3")
	private List<JsonMember3Item> jsonMember3;

	@SerializedName("5")
	private List<JsonMember5Item> jsonMember5;

	@SerializedName("20")
	private List<JsonMember20Item> jsonMember20;

	public void setJsonMember3(List<JsonMember3Item> jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public List<JsonMember3Item> getJsonMember3(){
		return jsonMember3;
	}

	public void setJsonMember5(List<JsonMember5Item> jsonMember5){
		this.jsonMember5 = jsonMember5;
	}

	public List<JsonMember5Item> getJsonMember5(){
		return jsonMember5;
	}

	public void setJsonMember20(List<JsonMember20Item> jsonMember20){
		this.jsonMember20 = jsonMember20;
	}

	public List<JsonMember20Item> getJsonMember20(){
		return jsonMember20;
	}

	@Override
 	public String toString(){
		return 
			"BatamSingapore{" + 
			"3 = '" + jsonMember3 + '\'' + 
			",5 = '" + jsonMember5 + '\'' + 
			",20 = '" + jsonMember20 + '\'' + 
			"}";
		}
}