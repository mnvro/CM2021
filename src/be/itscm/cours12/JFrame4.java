package be.itscm.cours12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField;
	private JLabel jLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame4 frame = new JFrame4();
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
	public JFrame4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jLabel = new JLabel("Nom : ");
		GridBagConstraints gbc_jLabel = new GridBagConstraints();
		gbc_jLabel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel.anchor = GridBagConstraints.EAST;
		gbc_jLabel.gridx = 3;
		gbc_jLabel.gridy = 2;
		contentPane.add(jLabel, gbc_jLabel);
		
		jTextField = new JTextField();
		jTextField.setText("Toto");
		GridBagConstraints gbc_jTextField = new GridBagConstraints();
		gbc_jTextField.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField.gridx = 4;
		gbc_jTextField.gridy = 2;
		contentPane.add(jTextField, gbc_jTextField);
		jTextField.setColumns(10);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonCancel.gridx = 3;
		gbc_jButtonCancel.gridy = 3;
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 4;
		gbc_jButtonOK.gridy = 3;
		contentPane.add(jButtonOK, gbc_jButtonOK);
		setTitle("Titre");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		switch (commande) {
			case "OK" : 
				System.out.println("Bonjour "+jTextField.getText());
			break;
			case "Cancel" :
				jTextField.setText("");
//				jLabel.setText("J'ai changé de valeur");
			break;
				
		}
	}

}
