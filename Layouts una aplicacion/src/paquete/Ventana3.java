package paquete;
import javax.swing.*;
import java.awt.event.*;

public class Ventana3 extends JFrame implements ActionListener {
	JPanel panel;
	JButton boton,boton2;
	JLabel texto;
	JTextField input;
	
	public Ventana3(){ //constructor
		
		panel = new JPanel();
		boton= new JButton("Oprimir");
		boton2= new JButton("Oprimir");
		texto= new JLabel();
		input = new JTextField("Escribe aqui");
		
		this.add(panel);
		
		panel.add(boton);
		panel.add(boton2); // Hacen casi lo mismo.
		panel.add(input);
		panel.add(texto);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// Cierra automaticamente la aplicacion.
		
		this.boton.addActionListener(this);
		this.boton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(boton))
		{
		this.texto.setText(this.input.getText());
		}
		
		if(arg0.getSource().equals(boton2))
		{
		this.texto.setText("Has oprimido el boton 2");
		}
	}
	
}
