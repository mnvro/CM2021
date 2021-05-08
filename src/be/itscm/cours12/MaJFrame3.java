package be.itscm.cours12;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MaJFrame3 extends JFrame {
	private String titre = "Titre";
	
	public MaJFrame3() throws HeadlessException {
		this.setTitle(titre);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(10, 10, 600, 400);
	}

	public static void main(String[] args) {
		MaJFrame3 mjf3 = new MaJFrame3();

	}

}
