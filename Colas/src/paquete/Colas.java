package paquete;
import java.util.*;
public class Colas {
//offer para añadir un dato, poll para obtener un dato.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList cola= new LinkedList();
		
		for(int x=1; x<=10;x++)
			cola.offer(x);
		
		
		while(cola.peek()!=null){
			System.out.println(cola.poll());
		}
	}

}
