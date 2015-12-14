package paquete;
import java.util.*;
public class Quicksort {

	public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
	
	int ar[]= new int[10];
	Ordenador o = new Ordenador();
	
		for(int x=0;x<ar.length;x++)
		{
			ar[x]=leer.nextInt();
		}
		o.ordenarq(ar);
		
		for(int x=0;x<ar.length;x++)
		{
			System.out.println(ar[x]);
		}
		
	}

}
