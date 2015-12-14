package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**for(int i=0; i<=10;i++){
		
			System.out.println("Estas todavia en el ciclo");
			//break; Es salirse de un ciclo. Se va cortar todas las funciones que se estan realizando dentro de ese ciclo y se va salir de ciclo. Se corta completamente el ciclo.
			if (i==4){
				break;
			}
			System.out.println("El valor de i es = "+i);
			
		}
		System.out.println("Hola ya saliste del ciclo");*/
		
		for(int i=0; i<=10; i++){
			System.out.println("Estas todavia en el ciclo");
			//continue;Va cortar el ciclo pero no se va salir completamente de el. Se termina el ciclo.
			if(i==4){
				continue;
			}
			System.out.println("El valor de i es= "+i);
		}
		System.out.println("Has dejado el ciclo for");
	}

}
