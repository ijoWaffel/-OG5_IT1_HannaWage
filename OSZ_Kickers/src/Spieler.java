
public class Spieler extends Personen {
	private int trikotnummer;

	private int spielerposition;

	public Spieler(String name, int telefonnummer, boolean jahresbeitrag, int trikotnummer, int spielerposition) {
		super(name, telefonnummer, jahresbeitrag);
		this.trikotnummer = trikotnummer;
		this.spielerposition = spielerposition;
	}

	public int getTrikotnummer() {
		return trikotnummer;
	}

	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}

	public int getSpielerposition() {
		return spielerposition;
	}

	public void setSpielerposition(int spielerposition) {
		this.spielerposition = spielerposition;
	} 
	


}
