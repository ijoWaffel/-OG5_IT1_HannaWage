
public class Schiedsrichter extends Personen{
	
	private int gepfiffeneSpiele;

	public Schiedsrichter(String name, int telefonnummer, boolean jahresbeitrag, int gepfiffeneSpiele) {
		super(name, telefonnummer, jahresbeitrag);
		this.gepfiffeneSpiele = gepfiffeneSpiele;
	}

	public int getGepfiffeneSpiele() {
		return gepfiffeneSpiele;
	}

	public void setGepfiffeneSpiele(int gepfiffeneSpiele) {
		this.gepfiffeneSpiele = gepfiffeneSpiele;
	}
	

}
