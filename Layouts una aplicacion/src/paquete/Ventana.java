package paquete;
import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame{
	 
	private JPanel panel1;
	private JPanel panel2;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	public Ventana(){
		this.setLayout(new BorderLayout());
		
		panel1=new JPanel();
		panel2=new JPanel();
		
		panel2.setLayout(new GridLayout(3,3,5,10));// Sirve para hacer teclado ,calculadoras.
		//filas,columnas,espacio libre entre filas, espacio libre entre columnas
		
		b1= new JButton("Prueba");
		b2= new JButton("Prueba");
		b3= new JButton("Prueba");
		b4= new JButton("Prueba");
		b5= new JButton("Prueba");
		b6= new JButton("Prueba");
		b7= new JButton("Prueba");
		b8= new JButton("Prueba");
		
		// Se a�aden los paneles.
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.SOUTH);
		
		panel2.add(b1);
		panel2.add(b2);
		
		panel2.add(b3);
		panel2.add(b4);
		
		panel2.add(b5);
		panel2.add(b6);
		
		panel1.add(b7);
		panel1.add(b8);
	}

}
