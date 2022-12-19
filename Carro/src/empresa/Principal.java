package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		Carro.PI = 70; //Está com erro pq foi usado final para PI
		
		System.out.println(Carro.milhasParaMetros(10));

	}

}
