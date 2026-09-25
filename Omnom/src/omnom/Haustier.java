package omnom;

public class Haustier {

	//Attribute 
	private int hunger;
	private int muede;
	private int zufrieden;
	private int gesund;
	private String name;
	
	//Methoden 
	
	public Haustier() {
		setHunger(100);
		setMuede(100);
		setZufrieden(100);
		setGesund(100);
		setName("");
	}
	public Haustier(String name ) {
		setHunger(100);
		setMuede(100);
		setZufrieden(100);
		setGesund(100);
		setName(name);
	}
	
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		
		if(hunger<0) {
			this.hunger = 0;
		}else if( hunger >100) {
			this.hunger = 100;
		}else {
			this.hunger = hunger;
		}
	}
	public int getMuede() {
		return muede;
	}
	public void setMuede(int muede) {
		if(muede<0) {
			this.muede = 0;
		}else if( muede >100) {
			this.muede = 100;
		}else {
			this.muede = muede;
		}
		
	}
	public int getZufrieden() {
		return zufrieden;
	}
	public void setZufrieden(int zufrieden) {
		if(zufrieden<0) {
			this.zufrieden = 0;
		}else if( zufrieden >100) {
			this.zufrieden = 100;
		}else {
			this.zufrieden = zufrieden;
		}
		
	}
	public int getGesund() {
		return gesund;
	}
	public void setGesund(int gesund) {
		if(gesund<0) {
			this.gesund = 0;
		}else if( gesund >100) {
			this.gesund = 100;
		}else {
			this.gesund = gesund;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public void fuettern(int anzahl) {
		setHunger(hunger+anzahl);
	}
	
	public void schlafen(int dauer) {
		setMuede(muede+dauer);
	}
	
	public void spielen ( int dauer) {
		setZufrieden(zufrieden+dauer);
	}
	
	public void heilen() {
		
	}
}