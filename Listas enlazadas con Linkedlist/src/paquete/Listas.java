package paquete;
import java.util.*;
public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**1-	LinkedList lista= new LinkedList();
		lista.add("Palabra");
		lista.add(5);
		lista.add(1,17);
		
		System.out.println("EL tamaño de la lista es "+lista.size());
		System.out.println(lista.get(0));//(0)son los indice. get nos permite obtener cualquier valor dado un indice ya que las listas se manejan en indice.*/
		
		LinkedList lista= new LinkedList();
		lista.add("Palabra");
		lista.add(5);
		lista.add(17);
		lista.add("palabra 2");
		
		lista.remove(0);//(0) Especificamos la variable que queremos quitar.
		
		System.out.println("EL tamaño de la lista es "+lista.size());
		System.out.println(lista.get(0));
	}

}
