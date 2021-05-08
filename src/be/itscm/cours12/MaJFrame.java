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
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MaJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField jTextFieldNom;
	private JTextField jTextFieldPrenom;
	private JButton jButtonOK;
	private JButton jButtonCancel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrame frame = new MaJFrame();
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
	public MaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		jTextFieldNom = new JTextField();
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 1;
		gbc_jTextFieldNom.gridy = 1;
		contentPane.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
		
		jTextFieldPrenom = new JTextField();
		jTextFieldPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextFieldPrenom.setText("");
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 2;
		gbc_jTextFieldPrenom.gridy = 1;
		contentPane.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonOK.gridx = 1;
		gbc_jButtonOK.gridy = 2;
		contentPane.add(jButtonOK, gbc_jButtonOK);
		
		jButtonCancel = new JButton("Cancel");
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.gridx = 2;
		gbc_jButtonCancel.gridy = 2;
		jButtonCancel.addActionListener(this);
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		switch (commande) {
		case "OK" : 
//			System.out.println("OK");
			
		break;
		case "Cancel" : 
//			System.out.println("Cancel");
			jTextFieldNom.setText("");
		break;
		}
		
	}

}
