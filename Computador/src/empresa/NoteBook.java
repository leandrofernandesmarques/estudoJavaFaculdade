package empresa;

public class NoteBook extends Computador {
	int polegadasTela;

	public NoteBook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}

	@Override
	double calculaValor() {
		double total = 250 * gbMemoria + 500 * numProcessadores + 100 * polegadasTela;
		return total;
	}
	
	
	


}
