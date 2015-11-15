package domain.tellers;

public class TerugLoopTeller extends Teller{
	
	private boolean oplopend;
	
	public boolean isOplopend() {
		return oplopend;
	}

	public void setOplopend(boolean oplopend) {
		this.oplopend = oplopend;
	}

	public TerugLoopTeller(){
		this.oplopend = true;
	}
	
	public TerugLoopTeller(Character[] arrayWaarden){
		this.setMogelijkeWaarden(arrayWaarden);
		this.oplopend = true;
	}
	
	@Override
	public void updateHuidigeWaarde() {
		int currentIndex = this.getHuidigeIndex();
		int arrayLength = this.getMogelijkeWaarden().length;
		
		if(this.oplopend){
			if(currentIndex == arrayLength-1){
				this.setOplopend(false);
				this.setHuidigeIndex(currentIndex - 1);
			} else{
				this.setHuidigeIndex(currentIndex + 1);
			}
		}else{
			if(currentIndex == 0){
				this.setOplopend(true);
				this.setHuidigeIndex(currentIndex + 1);
			} else{
				this.setHuidigeIndex(currentIndex - 1);
			}
		}	
	}

}
