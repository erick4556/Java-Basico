package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se puede usar int y char
		/**int x=0;
		switch(x)
		{
		case 0:
		{
			System.out.println("Esta es la opcion 0");// Es necesario para separar cada case usar el break.
			break;
		}
		case 1:
		{
		System.out.println("Esta es la opcion 1");
		break;	
		}
		
		}*/
		
		char x;
		x ='B';
		switch(x)
		{
		case 'a':
		{
			System.out.println("Esta es la opcion 0");// Es necesario para separar cada case usar el break.
			break;
		}
		case 'b':
		{
		System.out.println("Esta es la opcion 1");
		break;	
		}
		default: //Complementa lo que es switch case.
		{
			System.out.println("Esta opcion es la opcion por defecto");
		}
		
		}
	}

}
