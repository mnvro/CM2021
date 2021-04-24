package cm2021;

import javax.swing.JOptionPane;

public class Exemple {
	public static void main(String[] args) {
		System.out.println("Hello"+" "+"world!");
		JOptionPane.showMessageDialog(null, "message type 0","titre",0);
		JOptionPane.showMessageDialog(null, "message type 1","titre",1);
		JOptionPane.showMessageDialog(null, "message type 2","titre",2);
		JOptionPane.showMessageDialog(null, "message type 3","titre",3);
		JOptionPane.showConfirmDialog(null, "message", "titre",0);
	}
}
