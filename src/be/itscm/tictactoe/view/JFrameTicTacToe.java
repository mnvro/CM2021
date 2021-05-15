package be.itscm.tictactoe.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;

public class JFrameTicTacToe extends JFrame  {
	public static final int NBR_COLUMNS = 3;
	public static final int NBR_ROWS = 3;
	public static final String IMAGE_O = "/be/itscm/tictactoe/images/tic case o.png";
	public static final String IMAGE_X = "/be/itscm/tictactoe/images/tic case x.png";
	public static final String IMAGE_EMPTY = "/be/itscm/tictactoe/images/tic case vide.png";
	
	private JPanel contentPane;
	private JButtonTicTacToe jButtonMatrix[][] = new JButtonTicTacToe[NBR_COLUMNS][NBR_ROWS];

	/**
	 * Create the frame.
	 */
	public JFrameTicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 155, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1,1,1,1));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int column = 0 ; column < NBR_COLUMNS ; column++) {
			for (int row = 0 ; row < NBR_ROWS ; row++) {
				jButtonMatrix[column][row] = new JButtonTicTacToe(row,column);
				jButtonMatrix[column][row].setIcon(new ImageIcon(
						JFrameTicTacToe.class.getResource(IMAGE_EMPTY)));
				jButtonMatrix[column][row].setBorder(new EmptyBorder(0, 0, 0, 0));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = column;
				gbc.gridy = row;
				contentPane.add(jButtonMatrix[column][row], gbc);
			}
		}

	}
	
	public void reinit() {
		for (int column = 0 ; column < NBR_COLUMNS ; column++) {
			for (int row = 0 ; row < NBR_ROWS ; row++) {
				
				jButtonMatrix[column][row].setIcon(new ImageIcon(
						JFrameTicTacToe.class.getResource(IMAGE_EMPTY)));
				jButtonMatrix[column][row].setClickable(true);
			}
		}
	}

	/**
	 * Cette méthode permet de modifier l'image sur le jButton dont on précise la ligne et la colonne
	 * @param column la colonne où se trouve le JButton (0 = tout à gauche)
	 * @param row la ligne où se trouve le JButton (0 = tout en haut)
	 * @param s le nom du fichier image (son chemin et son nom) - on peut utiliser une des 3 constantes de classes: IMAGE_O, IMAGE_X et IMAGE_VIDE
	 */
	public void changeImageJButton(int column, int row, String s) {
		jButtonMatrix[column][row].setIcon(new ImageIcon(
				JFrameTicTacToe.class.getResource(s)));
	}

	/**
	 * Cette méthode permet de modifier l'image sur le jButton
	 * @param myJButtonTicTacToe le JButton dont on veut changer l'image
	 * @param s le nom du fichier de la nouvelle image
	 */
	public static void changeImageJButton(JButtonTicTacToe myJButtonTicTacToe, String s) {
		myJButtonTicTacToe.setIcon(new ImageIcon(
				JFrameTicTacToe.class.getResource(s)));
	}

	public void ajouteActionPerformed(ActionListener al) {
		for (int c = 0; c < NBR_COLUMNS; c++) {
			for (int l = 0; l < NBR_ROWS; l++) {
				jButtonMatrix[c][l].addActionListener(al);
			}
		}
	}

}
