package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import domain.Slot;
import ui.InstellingenPanel;

public class InstellingenController {
	
	private Slot slot;
	private InstellingenPanel instellingenPanel;
	
	public InstellingenController(Slot slot, JFrame instellingenVenster){
		this.slot=slot;
		instellingenPanel = new InstellingenPanel();
		instellingenPanel.setTekstForSaveSettingsButton("Instellingen opslaan");
		instellingenPanel.setSaveSettingsButtonListener(new SaveSettingsListener());
		instellingenVenster.add(instellingenPanel);
	}
	
	public boolean InputControle(){
		//return true of false naargelang input correct is. (bvb: check of de code van het geheime slot bestaat uit even veel character als de hoeveelheid tellers, ik zeg maar wat)
		try{
			//if bla bla
			return true;
		} catch (Exception exe){
			return false;
		}
	}
	
	class SaveSettingsListener implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 //vervang dit door een call naar de inputcontrole
			 
			 //Indien inputcontrole ok:
		     // maak lijst met tellers aan
			 // maak slot aan, met Slot(tellers, string van geheimecode)
			 // maak slotcontroller aan met slot, en Jframe
			 // toon Jframe
			 
			 JOptionPane.showMessageDialog(null, "deze tekst werd gestuurd vanuit de controller, om te laten zien dat MVC werkt.");		 
		 }
	}

}
