
public class Trainer extends Personen {
	
	private char lizensklasse; 

	private int aufwandsentschaedigung;

	public Trainer(String name, int telefonnummer, boolean jahresbeitrag, char lizensklasse,int aufwandsentschaedigung) {
		super(name, telefonnummer, jahresbeitrag);
		this.lizensklasse = lizensklasse;
		this.aufwandsentschaedigung = aufwandsentschaedigung;
	}

	public char getLizensklasse() {
		return lizensklasse;
	}

	public void setLizensklasse(char lizensklasse) {
		this.lizensklasse = lizensklasse;
	}

	public int getAufwandsentschaedigung() {
		return aufwandsentschaedigung;
	}

	public void setAufwandsentschaedigung(int aufwandsentschaedigung) {
		this.aufwandsentschaedigung = aufwandsentschaedigung;
	} 

}
