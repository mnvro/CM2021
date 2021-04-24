package be.itscm.cours11;

import javax.swing.JFrame;

public class MainJFrame {
	public static void main(String[] args) {
		JFrame maJFrame = new JFrame();
		JFrame maJFrame2 = new JFrame();
		maJFrame.setVisible(true);
		maJFrame.setBounds(50, 30, 300, 100);
		maJFrame.setTitle("Fenetre principale");
		maJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maJFrame2.setVisible(true);
		maJFrame2.setBounds(100, 60, 300, 100);
		maJFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		maJFrame2.setTitle("Fenetre secondaire");
		
	}
}
