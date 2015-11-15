package applicatie;

import domain.*;
import domain.tellers.*;
import java.util.ArrayList;
import javax.swing.JFrame;

import controller.InstellingenController;
import controller.SlotController;

public class Launcher{

   public static void main( String[] args ){
      JFrame bedieningVenster = new JFrame( "Knack die code" );
            
      //deze hardcoded values moeten vervangen worden door een instellingenvenster waar iemand vrij zijn tellers kan kiezen.  
      
      Teller t1= new CyclischeTeller(new Character[]{'a', 'b', 'c'});
      Teller t2=new TerugLoopTeller();
      Teller t3=new CyclischeTeller(new Character[]{'*','+','@'});  
      ArrayList<Teller>tellers =new ArrayList<Teller>();
      tellers.add(t1); tellers.add(t2); tellers.add(t3);
      String geheimeCode = "a4+";
      
      
      Slot slot =new Slot(tellers,geheimeCode);
      
      new InstellingenController(slot, bedieningVenster);
      
      //new SlotController(slot,bedieningVenster);

      bedieningVenster.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      bedieningVenster.setSize( 600, 400 ); 
      bedieningVenster.setVisible( true ); 
   } 
} 
