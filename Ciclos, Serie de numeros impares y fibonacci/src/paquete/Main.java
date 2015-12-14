package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1- Detectar si un numero es Impar
		for(int i=0; i<=100; i++){
			if((i%2)!=0){
				System.out.println(i);
			}
		}*/
		//Serie Fibonacci= Es la suma de dos numeros anteriores. 1,1,2,3,5,8,13,21,
		int x= 1;
		int anterior=0;
		int temp;
		while(true){
			System.out.println(x);
			temp=x;
			x=x+anterior;
			anterior = temp;
			if(x>100)
				break;
		}
		
	}

}
