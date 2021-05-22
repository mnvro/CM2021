package be.itscm.cours16.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import be.itscm.cours16.model.Date;
import be.itscm.cours16.model.Reunion;
import be.itscm.cours16.view.JFrameChageDate;
import be.itscm.cours16.view.TableauAffichage;

public class MainAffichageDateReunion implements ActionListener {
	private Reunion reunion;
	private TableauAffichage tableauAffichage;
	private JFrameChageDate jFrameChangeDate;
	
	public MainAffichageDateReunion() {
		reunion = new Reunion(new Date("22/5/2021"));
		tableauAffichage = new TableauAffichage();
		jFrameChangeDate = new JFrameChageDate();
		jFrameChangeDate.ajouteActionListener(this);
	}
	
	public static void main(String[] args) {
		new MainAffichageDateReunion();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		reunion = new Reunion(jFrameChangeDate.getDate());
		tableauAffichage.changeDate(reunion);
	}
}
