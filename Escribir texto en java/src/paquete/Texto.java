package paquete;
import java.io.*;
public class Texto {
	public void escribir(String nombreArchivo)
	{
		File f;// crea un objeto de tipo archivo.
		f=new File(nombreArchivo);// se asigna un nombre al archivo.
		
		//Escritura
		try{
			FileWriter w= new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			
			wr.write("Esto es una linea de texto");
			wr.append("\n esto es una concatenacion");
			wr.close();
			bw.close();
		}catch (IOException e){};
		
		
	}

	public void leer(String string) {
		// TODO Auto-generated method stub
		try{
			FileReader r= new FileReader(string);
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
	
}
