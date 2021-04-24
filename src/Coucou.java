import javax.swing.JOptionPane;

public class Coucou {
	public static void main(String[] args) {
		//System.out.println("Hello"+" "+"World! ");
		int a = (int)(Math.random()*11); 
		int b  = (int)(Math.random()*11);
		String rep = JOptionPane.showInputDialog(a + " + " + b + " = ");
		int rep_integer = Integer.parseInt(rep);
		if (rep_integer == a+b) 
			System.out.println("OK");
		else
			System.out.println("KO");
	}
}
