package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double converter() {
		double cotacao = 6;
		double total = valor * cotacao;
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", Euro convertido em Reais: " + converter() + "]";
	}

	

}
