package paquete;
import java.util.*;
import java.util.Scanner;

public class Inserccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int a[]= new int[4];
		Ordenador objeto= new Ordenador();
		for(int x=0;x<a.length;x++){	
		a[x]=leer.nextInt();
		}	
		objeto.ordenarInserccion(a);
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
	}

}
