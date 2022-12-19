package empresa;

public class Principal {

	public static void main(String[] args) {
		Gato g1 = new Gato();
		Animal a1 = new Gato();
		
		g1.emitirSom();
		g1.dormir();
		
		System.out.println();
		
		a1.emitirSom();
		a1.dormir();
	}

}
