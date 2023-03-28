package ed.ejercicioContador;

public class Contador {
	
	//Atributos
	private int maximo;
	private int contador;
	
	//Constructor
	public Contador(int maximo,int contador) {
		this.maximo=maximo;
		this.contador=contador;
	}
	
	//Propiedad lectura Getter 
	public int getContador() {
		return contador;
	}
	public int getMaximo() {
		return maximo;
	}
	
	//Métodos
	private void resetear() {
		this.contador=0;
	}
	public void incrementar() {
		this.contador++;
		
		if(this.contador==maximo)
			resetear();
	}
	
	
	
	
	

}
