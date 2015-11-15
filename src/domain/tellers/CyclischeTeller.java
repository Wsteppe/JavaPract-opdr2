package domain.tellers;

import java.util.ArrayList;

public class CyclischeTeller extends Teller{
	
	public CyclischeTeller(char a){
	}
		
	
	public CyclischeTeller(Character[] arrayWaarden){
		this.setMogelijkeWaarden(arrayWaarden);
	}

	@Override
	public void updateHuidigeWaarde() {
		// TODO Auto-generated method stub
			int currentIndex = this.getHuidigeIndex();
			int arrayLength = this.getMogelijkeWaarden().length;
			
			if(currentIndex == arrayLength -1){
				this.setHuidigeIndex(0);
			} else{
				this.setHuidigeIndex(currentIndex + 1);
			}				
	}
	

}
