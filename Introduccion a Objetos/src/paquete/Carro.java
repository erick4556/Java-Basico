package paquete;

public class Carro { //Tutorial 13
	
	double peso;
	double altura;
	double ancho;
	double largo;
	int Numerospuertas;
	boolean encendido =false;
	String modelo;
	
	
	public Carro()
	{
		this.peso=1000;
		this.altura=1.90;
		this.ancho=4;
	}
	public String modelo()
	{
		return this.modelo;
			
	}
	
	public double obternerPeso()
	{
		
		return this.peso;	
	}
	
	public void encender() //Estos son metodos.
	{
		this.encendido=true;
		System.out.println("El carro esta encendido");
	}
	
	public void apagar()
	{
		this.encendido=false;
		System.out.println("El carro esta apagado");
	}
	public void estado()
	{
		if(this.encendido==true) 
			System.out.println("El carro esta encendido");
		else
			System.out.println("El carro esta apagado");
	}
	public void informacion()
	{
		System.out.println("Este es un carro comun y corriente");
	}
}

class CarroPorchase extends Carro
{
	public CarroPorchase()
	{
		this.modelo="Porchase";
	}
	public void turbo()
	{
		System.out.println("Acavas de viajar a 100 millas por hora!");
	}
	public void informacion()
	{
		System.out.println("Este Porchase es del 2009");
	}
	
}

class CarroBMW extends Carro
{
	public CarroBMW()
	{
	this.modelo = "BMW";
	}
	
	public void informacion()
	{
		System.out.println("Este BMW es del 2012");
	}
	
}

class Carrito extends CarroBMW
{
	
}
