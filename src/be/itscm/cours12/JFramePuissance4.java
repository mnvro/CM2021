package be.itscm.cours12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;

public class JFramePuissance4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final static int NB_COLONNES = 7;
	private final static int NB_LIGNES = 7;
	
	private JButtonPuissance4 matrice[][] = new JButtonPuissance4[NB_COLONNES][NB_LIGNES];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePuissance4 frame = new JFramePuissance4();
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
	public JFramePuissance4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 380);
		setTitle("Puissance 4");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		for (int c = 0 ; c < NB_COLONNES ; c++) {
			for (int l = 0 ; l < NB_LIGNES ; l++) {
				matrice[c][l] = new JButtonPuissance4(c,l);
				matrice[c][l].addActionListener(this);
				matrice[c][l].setIcon(new ImageIcon(JFramePuissance4.class.getResource("/be/itscm/cours12/images/case vide.png")));
				matrice[c][l].setBorder(new EmptyBorder(0,0,0,0));
				gbc.gridx = c;
				gbc.gridy = l;
				contentPane.add(matrice[c][l], gbc);
			}
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonPuissance4 source = (JButtonPuissance4)(e.getSource());
		System.out.println("on a cliqué en ("+source.getColonne()+","+source.getLigne()+")");
		
	}

}
