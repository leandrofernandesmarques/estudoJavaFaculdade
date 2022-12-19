package empresa;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	double converter() {
		double cotacao = 1;
		double total = valor * cotacao;
		return total;
	}
	@Override
	double somar() {
		double totalGeral = converter();
		return totalGeral + converter();
	}

	@Override
	public String toString() {
		return "Real [valor=" + valor + ", Reais: = " + converter() + "]";
	}
	
	
}
