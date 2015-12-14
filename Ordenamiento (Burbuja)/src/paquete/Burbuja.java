package paquete;
import java.util.*;
public class Burbuja {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int a[]= new int[4];
		Ordenador objeto= new Ordenador();
		for(int x=0;x<a.length;x++){	
		a[x]=leer.nextInt();
		}	
		objeto.ordenar(a);
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
	}

}
