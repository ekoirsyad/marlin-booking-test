package marlin.com.marlinbookingtest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TanjungPinangTanahMerah{

	@SerializedName("3")
	private List<JsonMember3Item> jsonMember3;

	public void setJsonMember3(List<JsonMember3Item> jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public List<JsonMember3Item> getJsonMember3(){
		return jsonMember3;
	}

	@Override
 	public String toString(){
		return 
			"TanjungPinangTanahMerah{" + 
			"3 = '" + jsonMember3 + '\'' + 
			"}";
		}
}