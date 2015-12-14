package paquete;
import java.io.*;
public class Texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tips
		/**1- String texto="";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
		}catch(IOException e){};
		System.out.println(texto);*/
		
		/**2-String texto="";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
		}catch(IOException e){};
		texto=texto.concat("-esto es una concatenacion");
		System.out.println(texto);*/
		
		/**3-String texto="";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
		}catch(IOException e){};
		texto=texto.concat("-eSto Es una cOncatEnacion");
		texto = texto.toLowerCase(); // EL toLowercase cambia todo a minusculas.
		//texto= texto.toUpperCase();// Coloca todo en mayuscula.
		System.out.println(texto);*/
		
		/**4-String texto="";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
		}catch(IOException e){};
		texto=texto.concat("");
		int a = texto.length();//// Indica la cantidad de espacio conetnidas.
		texto = texto.toLowerCase(); 
		System.out.println(texto);
		System.out.println("La frase tiene "+a+" letras");*/
		
		/**5-String texto="";
		int x=0;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
			x=Integer.parseInt(texto);
		}catch(IOException e){};
		System.out.println(x+6);*/
		
		/**6-String texto="";
		double x=0;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (in); //Espacio en memoria que almacena dato.
		
		try{
			texto= buffer.readLine();
			x=Double.parseDouble(texto);//Convierte variable cadena en entero. Integer.parseInt pa entero.
		}catch(Exception e){
			System.out.println("Debes escribir un numero");
		};
		System.out.println(x+6);*/
		
		//Lo contrario.
		String texto="";
		double x=50.3;
		texto=String.valueOf(x);
		texto=texto.concat("-Double");	
		System.out.println(texto);
	}

}
