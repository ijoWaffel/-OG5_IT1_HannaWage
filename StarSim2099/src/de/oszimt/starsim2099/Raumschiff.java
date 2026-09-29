package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff extends ObjektImRaum{

	// Attribute
	
	private int MaxLadekapazitaet;
	private String typ;
	private String antrieb;
	private int winkel;
	// Methoden

	public Raumschiff() {
		super();
	}


	public int getMaxLadekapazitaet() {
		return MaxLadekapazitaet;
	}

	public void setMaxLadekapazitaet(int maxKapazitaet) {
		this.MaxLadekapazitaet = maxKapazitaet;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getAntrieb() {
		return antrieb;
	}

	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}

	public int getWinkel() {
		return winkel;
	}

	public void setWinkel(int winkel) {
		this.winkel = winkel;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}
