package paquete;
import java.io.*;
public class Texto {
	
	public void leer(String nombreArchivo)
	{
		try{
			FileReader r= new FileReader(nombreArchivo);
			BufferedReader buffer= new BufferedReader(r);
			//System.out.println(buffer.readLine()); lee una por una.
			//System.out.println(buffer.readLine()); lee una por una.
			//Para poder leer varias lineas de codigos.
			String temp="";
			
			while(temp!=null){
				temp=buffer.readLine();
				if(temp==null)
					break;
				System.out.println(temp);
			}; 
		}catch(Exception e){//Esto ayuda a avisarte que no se encontro algun archivo.
			System.out.println(e.getMessage());
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
