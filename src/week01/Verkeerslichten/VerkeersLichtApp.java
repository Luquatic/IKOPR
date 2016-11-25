package week01.Verkeerslichten;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VerkeersLichtApp extends JFrame {
	
	public VerkeersLichtApp() {
		setSize(300, 400);
		setTitle("Verkeerslicht applicatie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HoofdPaneel paneel = new HoofdPaneel();
		add(paneel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new VerkeersLichtApp();

	}

}
