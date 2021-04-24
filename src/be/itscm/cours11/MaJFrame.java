package be.itscm.cours11;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaJFrame extends JFrame {
	private JButton tabJButton[] = new JButton[10];
	private JTextField monJTextField = new JTextField("                  ");
	private JLabel monJLabel = new JLabel("Mon label");

	public MaJFrame() {
		this.setBounds(100,100,500,400);
		this.setTitle("Ma JFrame");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
		for (int i = 0 ; i < tabJButton.length ; i++) {
			tabJButton[i] = new JButton("OK "+ (i+1));
			this.getContentPane().add(tabJButton[i]);
		}
		this.getContentPane().add(monJTextField);
		this.getContentPane().add(monJLabel);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MaJFrame mjf = new MaJFrame();

	}


}
