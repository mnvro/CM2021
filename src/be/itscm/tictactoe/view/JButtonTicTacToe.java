package be.itscm.tictactoe.view;

import javax.swing.JButton;

public class JButtonTicTacToe extends JButton {
	private int column,row;
	private boolean clickable = true;

	public JButtonTicTacToe(int column, int row) {
		this.column = column;
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public boolean isClickable() {
		return clickable;
	}

	public void setClickable(boolean cliquable) {
		this.clickable = cliquable;
	}

	public int getRow() {
		return row;
	}
	
}
