package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTree;

public class Aplicacion extends JFrame {

	private JPanel contentPane;
	protected JLabel textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
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
	public Aplicacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHolaMundo = new JLabel("Hola mundo");
		lblHolaMundo.setFont(new Font("Aharoni", Font.PLAIN, 15));
		lblHolaMundo.setForeground(Color.RED);
		lblHolaMundo.setBounds(10, 11, 103, 43);
		contentPane.add(lblHolaMundo);
		
		JButton btnOprima = new JButton("Oprima");	
		btnOprima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("Hola");
			}
		});
		btnOprima.setBackground(Color.WHITE);
		btnOprima.setForeground(Color.RED);
		btnOprima.setFont(new Font("Agency FB", Font.PLAIN, 18));
		btnOprima.setBounds(10, 50, 89, 23);
		contentPane.add(btnOprima);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setBounds(123, 50, 89, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
