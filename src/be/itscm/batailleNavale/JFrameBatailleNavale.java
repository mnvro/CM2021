package be.itscm.batailleNavale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import java.awt.Color;

public class JFrameBatailleNavale extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton tabJButton[][] = new JButton[11][11];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameBatailleNavale frame = new JFrameBatailleNavale();
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
	public JFrameBatailleNavale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 610);
		setTitle("Bataille navale");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 0, 0);
		
		gbc.gridy = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			tabJButton[i][0] = new JButton();
			gbc.gridx = i;
			tabJButton[i][0].setBorder(new LineBorder(new Color(0, 0, 0)));
			tabJButton[i][0].setIcon(new ImageIcon(JFrameBatailleNavale.class.getResource("/images/"+i+".png")));
			contentPane.add(tabJButton[i][0], gbc);
		}
		
		gbc.gridx = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			tabJButton[0][i] = new JButton();
			gbc.gridy = i;
			tabJButton[0][i].setBorder(new LineBorder(new Color(0, 0, 0)));
			tabJButton[0][i].setIcon(new ImageIcon(JFrameBatailleNavale.class.getResource("/images/"+i+"V.png")));
			contentPane.add(tabJButton[0][i], gbc);
		}
		
		for (int c = 1 ; c <= 10 ; c++) {
			for (int l = 1 ; l <= 10 ; l++) {
				tabJButton[c][l] = new JButtonBatailleNavale(c,l);
				tabJButton[c][l].addActionListener(this);
				gbc.gridx = c;
				gbc.gridy = l;
				tabJButton[c][l].setBorder(new LineBorder(new Color(0, 0, 0)));
				tabJButton[c][l].setIcon(new ImageIcon(JFrameBatailleNavale.class.getResource("/images/case vide bleue.png")));
				contentPane.add(tabJButton[c][l], gbc);
			}
		}
		for (int i = 0 ; i < Bateau.TAB_BATEAUX.length ; i++) {

			placeBateau(Bateau.TAB_BATEAUX[i]);
		}
	}
	
	public void placeBateau(Bateau bateau) {
		int c = bateau.getColonne();
		int l = bateau.getLigne();
		int d = bateau.getDirection();
		String tabS[] = bateau.getTabNomsFichiers();
		if (d == Bateau.DIRECTION_HORIZONTALE) {
			for (int i = 0 ; i < bateau.getTaille() ; i++) {
				JButtonBatailleNavale jbnn = (JButtonBatailleNavale)(tabJButton[i+c][l]);
				jbnn.chargeImage(tabS[i]);
				jbnn.setLibre(false);
			}
		}
		if (d == Bateau.DIRECTION_VERTICALE) {
			for (int i = 0 ; i < bateau.getTaille() ; i++) {
				JButtonBatailleNavale jbnn = (JButtonBatailleNavale)(tabJButton[c][i+l]);
				jbnn.chargeImage(tabS[i]);
				jbnn.setLibre(false);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonBatailleNavale jbbn = (JButtonBatailleNavale)e.getSource();
//		System.out.println("on a cliqué sur " + jbbn.toString());

		if (jbbn.isLibre()) {
			jbbn.chargeImage("/images/case à l'eau.png");
		} else {
			jbbn.chargeImage("/images/case touché.png");
		}
		
	}

}
