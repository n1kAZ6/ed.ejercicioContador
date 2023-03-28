package ed.ejercicioContador;

public class PrincipalContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Contador c1 = new Contador(10,0);
		
		System.out.println("Valor maximo del contador --> "+c1.getMaximo());
		for(int i=0;i<10;i++) {
			c1.incrementar();
			System.out.println("Contador tras incremento --> "+c1.getContador());			
		}
	}

}
