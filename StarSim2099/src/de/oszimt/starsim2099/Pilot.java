package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot extends ObjektImRaum{


	// Attribute
	private String grad;
	private String name;
	// Methoden
	
	public Pilot(double posX, double posY, String grad, String name) {
		super(posX,posY);
		this.grad = grad;
		this.name = name;
	}
	
	public Pilot() {
		
	}

	
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
