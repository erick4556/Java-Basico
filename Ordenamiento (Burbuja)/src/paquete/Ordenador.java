package paquete;

public class Ordenador {

	public void ordenar(int e[]){
		int aux;
		boolean cambios=false;
		
		while(true){
			cambios=false;
			for(int x=1;x<e.length;x++){
				if(e[x]<e[x-1])
				{
					aux =e[x];
					e[x]=e[x-1];
					e[x-1]=aux;
					cambios=true;
				}
			}
			if(cambios==false)
				break;
		}
	}

}
