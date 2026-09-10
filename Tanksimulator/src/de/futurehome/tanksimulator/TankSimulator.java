package de.futurehome.tanksimulator;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class TankSimulator extends Frame {
	
	public Tank myTank;
	
	private Label lblUeberschrift = new Label("Tank-Simulator");
	public  Label lblFuellstand = new Label("     ");
	public  Label lblFuellstandProzent = new Label("     ");
	
	public Button btnBeenden = new Button("Beenden");
	public Button btnEinfuellen = new Button("Einfüllen");
	public Button btnVerbrauchen = new Button("Verbrauchen");
	public Button btnZuruecksetzen = new Button("Zurücksetzen");
	
	public JProgressBar progressBar = new JProgressBar(1,0,200);
	
	public JSlider slider= new JSlider(0,4);
	
	private Panel pnlNorth = new Panel(new GridLayout(0, 1));
	private Panel pnlCenter = new Panel(new GridLayout(1, 0));
	private Panel pnlSouth = new Panel(new GridLayout(1, 0));

	private MyActionListener myActionListener = new MyActionListener(this);

	public TankSimulator() {
		super("Tank-Simulator");
		
		myTank = new Tank(0);
		
		this.lblUeberschrift.setFont(new Font("", Font.BOLD, 16));
		this.pnlNorth.add(this.lblUeberschrift);
		this.pnlNorth.add(this.slider);
		this.pnlCenter.add(this.lblFuellstand);
		this.pnlCenter.add(this.lblFuellstandProzent);
		this.pnlCenter.add(this.progressBar);
		this.pnlSouth.add(this.btnEinfuellen);
		this.pnlSouth.add(this.btnVerbrauchen);
		this.pnlSouth.add(this.btnZuruecksetzen);
		this.pnlSouth.add(this.btnBeenden);
		this.add(this.pnlNorth, BorderLayout.NORTH);
		this.add(this.pnlCenter, BorderLayout.CENTER);
		this.add(this.pnlSouth, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
		
		// Ereignissteuerung
		this.btnEinfuellen.addActionListener(myActionListener);
		this.btnVerbrauchen.addActionListener(myActionListener);
		this.btnZuruecksetzen.addActionListener(myActionListener);
		this.btnBeenden.addActionListener(myActionListener);
	}

	public static void main(String argv[]) {
		new TankSimulator();
	}
}