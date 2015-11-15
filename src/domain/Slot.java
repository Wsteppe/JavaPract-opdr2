package domain;

import java.util.ArrayList;
import java.util.List;

import domain.tellers.Teller;

public class Slot {
	private String geheimeCode;
	private List<Teller> tellers;
	private boolean geheimGevonden;

	public List<Teller> getTellers() {
		return this.tellers;
	}

	public void setTellers(List<Teller> lijstTellers) {
		this.tellers = lijstTellers;
	}

	public String getGeheimeCode() {
		return geheimeCode;
	}

	public void setGeheimeCode(String geheimeCode) {
		this.geheimeCode = geheimeCode;
	}
	
	public void setGeheimGevonden(boolean geheimGevonden) {
		this.geheimGevonden = geheimGevonden;
	}
	
	public Slot(List<Teller> lijstTeller, String code){
		this.setTellers(lijstTeller);
		this.setGeheimeCode(code);
		this.setGeheimGevonden(false);
	}

	public char getWaardeTeller(int tellerNummer){
		return this.tellers.get(tellerNummer).getHuidigeWaarde();
	}
	
	public String getSlotKombinatie() {
		String code = "";
		
		for(Teller teller : this.getTellers()){
			code += teller.getHuidigeWaarde();
		}
		return code;
	}
	
	public void updateHuidigeWaardeTeller(int tellerNummer){
		this.tellers.get(tellerNummer).updateHuidigeWaarde();
	}
	
	public int getAantalTellers() {
		return this.tellers.size();
	}
	
	public boolean isGeheimGevonden() {
		return this.geheimGevonden;
	}
	
	public void resetTellers() {
		List<Teller> tellerLijst = new ArrayList<Teller>();
		this.setTellers(tellerLijst);
	}

}
