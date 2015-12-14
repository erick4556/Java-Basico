package paquete;
import java.util.*;
public class Pila {
	/**push: Insertar elemento.
	 * pop:Eliminar elemento.
	 * peek:Ver cual es ultimo dato que se introdujo en la pila.
	 * empty:Verifica si la pila tiene o no tiene datos adentro.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack pila=new Stack();
		pila.push(50); // Va tomar un indice de 0.
		pila.push("String");// Va ser el indice 1.  Solo se puede obtener el ultimo valor que se introdujo.
		pila.push(17);
		pila.push("palabra");
		pila.push(3);
		System.out.println("El ultimo elemento en la pila es "+pila.peek());
		
		while(pila.empty()==false){//Mientras que la pila no este vacia.
			System.out.println(pila.pop());
		}
	}

}
