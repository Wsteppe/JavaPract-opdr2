package ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InstellingenPanel extends JPanel {
	
	private JButton saveSettingsButton;
	private JPanel saveSettingsPanel;
	
	public InstellingenPanel(){
		
		saveSettingsPanel = new JPanel();
		saveSettingsButton = new JButton("Kluis instellingen opslaan");
		saveSettingsPanel.add(saveSettingsButton);
		
		this.add(saveSettingsPanel);
	   }
	
	public void setSaveSettingsButtonListener(ActionListener listenerForControleButton){
		  saveSettingsButton.addActionListener(listenerForControleButton);			 
	}
	
	   public void setTekstForSaveSettingsButton(String tekst){
		   saveSettingsButton.setText(tekst);
	   }

}
