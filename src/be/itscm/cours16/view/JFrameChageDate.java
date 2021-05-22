package be.itscm.cours16.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.itscm.cours16.model.Date;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JFrameChageDate extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldDate;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameChageDate frame = new JFrameChageDate();
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
	public JFrameChageDate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Date prochaine r\u00E9union : ");
		contentPane.add(lblNewLabel);
		
		jTextFieldDate = new JTextField();
		contentPane.add(jTextFieldDate);
		jTextFieldDate.setColumns(10);
		
		btnNewButton = new JButton("Modifier la date");
		contentPane.add(btnNewButton);
		
		this.setVisible(true);
	}

	public Date getDate() {
		Date d = new Date(jTextFieldDate.getText());
		return d;
	}
	public void ajouteActionListener(ActionListener al) {
		btnNewButton.addActionListener(al);
	}
}
