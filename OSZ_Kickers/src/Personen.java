
public abstract class Personen {
	
	private String name; 

	private int telefonnummer;

	private boolean jahresbeitrag;

	public Personen(String name, int telefonnummer, boolean jahresbeitrag) {
		super();
		this.name = name;
		this.telefonnummer = telefonnummer;
		this.jahresbeitrag = jahresbeitrag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public boolean getJahresbeitrag() {
		return jahresbeitrag;
	}

	public void setJahresbeitrag(boolean jahresbeitrag) {
		this.jahresbeitrag = jahresbeitrag;
	} 
	

}
