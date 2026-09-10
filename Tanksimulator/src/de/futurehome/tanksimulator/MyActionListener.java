package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);
		
		if (obj == f.btnEinfuellen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double fuellstandProzent;
			 
			 fuellstand = fuellstand + 5;
			 fuellstandProzent=fuellstand*100/200;
			 
			 f.myTank.setFuellstand(fuellstand);
			 f.progressBar.setValue((int) fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblFuellstandProzent.setText(""+fuellstandProzent+"%");
		}
		
		if (obj == f.btnVerbrauchen) {
			double fuellstand = f.myTank.getFuellstand();
			double fuellstandProzent;
			
			fuellstand = fuellstand -2;
			fuellstandProzent=fuellstand*100/200;
			 
			if(fuellstand <0) {
				
				 f.myTank.setFuellstand(0);
				 f.progressBar.setValue(0);
				 
				 f.lblFuellstand.setText(""+0);
				 f.lblFuellstandProzent.setText(""+0+"%");
			}else {
			
			 f.myTank.setFuellstand(fuellstand);
			 f.progressBar.setValue((int) fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblFuellstandProzent.setText(""+fuellstandProzent+"%");
			}
		}
		
		if (obj == f.btnZuruecksetzen) {
			
			 f.myTank.setFuellstand(0);
			 f.progressBar.setValue(0);

			 f.lblFuellstand.setText(""+0);
			 f.lblFuellstandProzent.setText(""+0+"%");
		}

	}
}