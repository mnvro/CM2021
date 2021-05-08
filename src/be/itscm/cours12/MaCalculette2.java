package be.itscm.cours12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaCalculette2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton tabJButton[] = new JButton[10];
	private JTextField jTextFiedl;
	private int nb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaCalculette2 frame = new MaCalculette2();
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
	public MaCalculette2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.insets = new Insets(0, 0, 0, 5);
		for (int i = 0; i < tabJButton.length; i++) {
			tabJButton[i] = new JButton(i+"");
			tabJButton[i].addActionListener(this);
		}
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(
				tabJButton[7], gbc);
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

		JButton jButtonPlus = new JButton("+");
		jButtonPlus.addActionListener(this);

		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 3;
		gbc.gridy = 2;
		contentPane.add(jButtonPlus, gbc);

		JButton jButtonEgal = new JButton("=");
		jButtonEgal.addActionListener(this);

		gbc.gridx = 3;
		gbc.gridy = 3;
		contentPane.add(jButtonEgal, gbc);
		
		JButton jButtonClear = new JButton("C");
		jButtonClear.addActionListener(this);

		gbc.gridx = 3;
		gbc.gridy = 4;
		contentPane.add(jButtonClear, gbc);

		jTextFiedl = new JTextField();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		jTextFiedl.setHorizontalAlignment(SwingConstants.RIGHT);
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(jTextFiedl, gbc);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		
		switch (commande) {
		case "+":
			nb = Integer.parseInt(jTextFiedl.getText());
			jTextFiedl.setText("");
			break;
		case "=":
			nb += Integer.parseInt(jTextFiedl.getText());
			jTextFiedl.setText(nb+"");
			nb = 0;
			break;
		case "C":
			jTextFiedl.setText("");
			nb = 0;
			break;	
		default:
			jTextFiedl.setText(jTextFiedl.getText()+commande);
		}
		
	}

}
