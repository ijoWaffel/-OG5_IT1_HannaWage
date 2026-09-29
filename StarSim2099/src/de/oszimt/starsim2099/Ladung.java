package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung extends ObjektImRaum{

	// Attribute
	private String typ;
	private int masse;
	
	
	// Methoden
	public Ladung() {
		setTyp(" ");
		setMasse(0);
		setPosX(0);
		setPosY(0);
	}
	
	public void setTyp( String newtyp) {
		typ=newtyp;
	}
	
	public String getTyp() {
		return typ;
	}
	
	
	public void setMasse( int newmasse) {
		masse=newmasse;
	}
	
	public int getMasse() {
		return masse;
	}
	
	
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}