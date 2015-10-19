package domain;

import java.util.ArrayList;
import java.util.List;

import domain.*;
import domain.tellers.Teller;

public class Slot {

	private String geheimeCode;

	
	public Slot() throws Exception
	{
	}
	
	public char getWaardeTeller(int teller){
		char character = 'F';
		return character;
	}
	
	public List<Teller> getTellers() {
		  List<Teller> list = new ArrayList<Teller>();      
		  return list;
	}
	
	public String getSlotKombinatie(){
		String slotKombinatie = "123";
		return slotKombinatie;
	}
	
	public void updateHuidigeWaardeTeller(int waarde){
	}
	
	public int getAantalTellers(){
		int aantalTellers = 1;
		return aantalTellers;
	}
	
	public boolean isGeheimGevonden(){
		
		boolean gevonden = false;
		return gevonden;
	}
	
	public void resetTellers(){
	}
	
}
