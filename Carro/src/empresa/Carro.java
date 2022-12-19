package empresa;

public class Carro {
	String nome;
	String modelo;
	float velocidade;
	
	static final double PI = 3.1415;//Final: O PI não pode ser mudado!!
	
	static float milhasParaMetros (float milhas) {
		return milhas * 1600;
	}
}