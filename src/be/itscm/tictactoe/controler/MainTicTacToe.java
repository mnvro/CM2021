package be.itscm.tictactoe.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import be.itscm.tictactoe.model.TicTacToeModel;
import be.itscm.tictactoe.view.JButtonTicTacToe;
import be.itscm.tictactoe.view.JFrameTicTacToe;



public class MainTicTacToe implements ActionListener {
	private JFrameTicTacToe jFrameTicTacToe;
	private TicTacToeModel ticTacToeModel;
	
	public MainTicTacToe() {
		jFrameTicTacToe = new JFrameTicTacToe();
		jFrameTicTacToe.setVisible(true);
		jFrameTicTacToe.ajouteActionPerformed(this);
		ticTacToeModel = new TicTacToeModel();
	}

	public void actionPerformed(ActionEvent e) {
		JButtonTicTacToe myJButton = (JButtonTicTacToe)e.getSource();
		if (myJButton.isClickable()) {
			myJButton.setClickable(false);
			int colonne = myJButton.getColumn();
			int ligne = myJButton.getRow();
			if (ticTacToeModel.getTurn() == 0) {
				JFrameTicTacToe.changeImageJButton(myJButton,JFrameTicTacToe.IMAGE_O);
			}else {
				JFrameTicTacToe.changeImageJButton(myJButton,JFrameTicTacToe.IMAGE_X);
			}
			ticTacToeModel.play(colonne, ligne);
			int gagnant = ticTacToeModel.win();
			if (gagnant >=0) {
				JOptionPane.showMessageDialog(null,"And the winner is "+ticTacToeModel.ARRAY_CHAR[gagnant]);
				jFrameTicTacToe.reinit();
				ticTacToeModel = new TicTacToeModel();
			} else {
				if (gagnant == -2) {
					JOptionPane.showMessageDialog(null,"Draw!");
					jFrameTicTacToe.reinit();
					ticTacToeModel = new TicTacToeModel();
				}
			}	
		}
	}
	public static void main(String[] args) {
		new MainTicTacToe();
	}
}
