package marlin.com.marlinbookingtest.model;

import com.google.gson.annotations.SerializedName;

public class Payload{

	@SerializedName("Tanjung Pinang - Tanah Merah")
	private TanjungPinangTanahMerah tanjungPinangTanahMerah;

	@SerializedName("Batam - Johor Bahru")
	private BatamJohorBahru batamJohorBahru;

	@SerializedName("Batam - Singapore")
	private BatamSingapore batamSingapore;

	public void setTanjungPinangTanahMerah(TanjungPinangTanahMerah tanjungPinangTanahMerah){
		this.tanjungPinangTanahMerah = tanjungPinangTanahMerah;
	}

	public TanjungPinangTanahMerah getTanjungPinangTanahMerah(){
		return tanjungPinangTanahMerah;
	}

	public void setBatamJohorBahru(BatamJohorBahru batamJohorBahru){
		this.batamJohorBahru = batamJohorBahru;
	}

	public BatamJohorBahru getBatamJohorBahru(){
		return batamJohorBahru;
	}

	public void setBatamSingapore(BatamSingapore batamSingapore){
		this.batamSingapore = batamSingapore;
	}

	public BatamSingapore getBatamSingapore(){
		return batamSingapore;
	}

	@Override
 	public String toString(){
		return 
			"Payload{" + 
			"tanjung Pinang - Tanah Merah = '" + tanjungPinangTanahMerah + '\'' + 
			",batam - Johor Bahru = '" + batamJohorBahru + '\'' + 
			",batam - Singapore = '" + batamSingapore + '\'' + 
			"}";
		}
}