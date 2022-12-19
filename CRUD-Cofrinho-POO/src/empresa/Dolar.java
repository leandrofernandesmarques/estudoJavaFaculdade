package empresa;

public class Dolar extends Moeda {
	
	

	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	double converter() {
		double cotacao = 5;
		double total = valor * cotacao;
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Dolar [valor=" + valor + ", Dolar Convertido em Reais: " + converter() + "]";
	}
	

	
	

}
