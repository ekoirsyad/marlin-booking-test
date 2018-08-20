package marlin.com.marlinbookingtest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BatamJohorBahru{

	@SerializedName("4")
	private List<JsonMember4Item> jsonMember4;

	public void setJsonMember4(List<JsonMember4Item> jsonMember4){
		this.jsonMember4 = jsonMember4;
	}

	public List<JsonMember4Item> getJsonMember4(){
		return jsonMember4;
	}

	@Override
 	public String toString(){
		return 
			"BatamJohorBahru{" + 
			"4 = '" + jsonMember4 + '\'' + 
			"}";
		}
}