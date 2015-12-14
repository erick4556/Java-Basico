package paquete;

public class Ordenador {

	public void ordenarInserccion(int a[]){
		int aux;
		int cont1;
		int cont2;
		
		for(cont1=1;cont1<a.length;cont1++){
			aux=a[cont1];
			for(cont2=1-1;cont2>=0 && a[cont2]>aux;cont2--){
				a[cont2+1]=a[cont2];
				a[cont2]=aux;
			}
		}
	}
}
