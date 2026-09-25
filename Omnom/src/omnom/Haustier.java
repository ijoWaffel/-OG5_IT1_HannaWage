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
		if(hunger>=0 && hunger <=100) {
			this.hunger = hunger;
		}
	}
	public int getMuede() {
		return muede;
	}
	public void setMuede(int muede) {
		if(muede>=0 && muede <=100) {
			this.muede = muede;
		}
	}
	public int getZufrieden() {
		return zufrieden;
	}
	public void setZufrieden(int zufrieden) {
		if(zufrieden>=0 && zufrieden <=100) {
		this.zufrieden = zufrieden;
		}
	}
	public int getGesund() {
		return gesund;
	}
	public void setGesund(int gesund) {
		if(gesund>=0 && gesund <=100) {
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
		
	}
	
	public void schlafen(int dauer) {
		
	}
	
	public void spielen ( int dauer) {
		
	}
	
	public void heilen() {
		
	}
}