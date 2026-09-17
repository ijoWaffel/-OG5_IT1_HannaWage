package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	// Attribute
	private String typ;
	private int masse;
	private double posX;
	private double posY;
	
	// Methoden
	public Ladung() {
		setTyp(" ");
		
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
	
	
	public void setPosX( double newposX) {
		posX=newposX;
	}
	
	public double getPosX() {
		return posX;
	}
	
	public void setPosY( double newposY) {
		posY=newposY;
	}
	
	public double getPosY() {
		return posY;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}