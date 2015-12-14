package paquete;
import paquete.Carro;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Esto es para el radio
		
		CarroPorchase c;
		c=new CarroPorchase();
		c.apagar();
		c.encender();
		c.turbo();
		c.modelo();
		c.informacion();
		
		/**c=new Carro();
		c.estado();
		c.encender();
		c.estado();*/
		
		/**Esto es para la pelota
		Pelota p;
		p= new Pelota(500,500);
		p.atraparPelota();*/
		
		/**Pelota p= new Pelota(300,300);
		Pelota pB = new Pelota(500,500);
		System.out.println("La pelota pesa = "+pB.obtenerPeso());*/	
	}

}
