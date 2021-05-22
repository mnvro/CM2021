package be.itscm.cours16.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.itscm.cours16.model.Date;
import be.itscm.cours16.model.Reunion;

import java.awt.FlowLayout;
import javax.swing.JLabel;

public class TableauAffichage extends JFrame {

	private JPanel contentPane;
	private JLabel jLabelDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableauAffichage frame = new TableauAffichage();
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
	public TableauAffichage() {
		setTitle("Tableau d'affichage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("La prochaine r\u00E9union aura lieu le : ");
		contentPane.add(lblNewLabel);
		
		jLabelDate = new JLabel("New label");
		contentPane.add(jLabelDate);
		
		this.setVisible(true);
	}
	
	public void changeDate(Reunion reunion) {
		jLabelDate.setText(reunion.toString());
	}

}
