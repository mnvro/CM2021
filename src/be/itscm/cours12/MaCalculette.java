package be.itscm.cours12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MaCalculette extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField;
	private JButton tabJButton[] = new JButton[10];
	private double nb;
	private String operateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaCalculette frame = new MaCalculette();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaCalculette() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		jTextField = new JTextField();
		jTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		gbc.gridwidth = 4;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(jTextField, gbc);
		jTextField.setColumns(10);
		
		gbc.gridwidth = 1;
		
		JButton jButtonPlus = new JButton("+");
		jButtonPlus.addActionListener(this);
		
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		contentPane.add(jButtonPlus, gbc);
				
		for (int i = 0; i < tabJButton.length; i++) {
			tabJButton[i] = new JButton(i+"");
			tabJButton[i].addActionListener(this);
		}
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(tabJButton[7], gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		contentPane.add(tabJButton[8], gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		contentPane.add(tabJButton[9], gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		contentPane.add(tabJButton[4], gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		contentPane.add(tabJButton[5], gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		contentPane.add(tabJButton[6], gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		contentPane.add(tabJButton[1], gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		contentPane.add(tabJButton[2], gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		contentPane.add(tabJButton[3], gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		contentPane.add(tabJButton[0], gbc);
		
		JButton jButtonEgale = new JButton("=");
		jButtonEgale.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 4;
		contentPane.add(jButtonEgale, gbc);
		
		JButton jButtonC = new JButton("C");
		jButtonC.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		contentPane.add(jButtonC, gbc);
		
		JButton jButtonPoint = new JButton(".");
		jButtonPoint.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		contentPane.add(jButtonPoint, gbc);
		
		JButton jButtonFois = new JButton("*");
		jButtonFois.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		contentPane.add(jButtonFois, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		switch (commande) {
		case "=" : 
			if (operateur.compareTo("+")==0)
				nb += Double.parseDouble(jTextField.getText());
			else
				nb *= Double.parseDouble(jTextField.getText());
				
			jTextField.setText(nb+"");
			nb = 0;
			break;
		case "+" :
			nb = Double.parseDouble(jTextField.getText());
			jTextField.setText("");
			operateur = "+";
			break;
		case "*" :
			nb = Double.parseDouble(jTextField.getText());
			jTextField.setText("");
			operateur = "*";
			break;
		case "C" :
			jTextField.setText("");
			nb = 0;
			break;
		default :
			jTextField.setText(jTextField.getText()+commande);
		}
	}

}
