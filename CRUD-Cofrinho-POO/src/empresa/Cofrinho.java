package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	public void remover (Moeda m) {
		listaMoedas.remove(m);
	}
	public void listar() {
		for(Moeda m : listaMoedas) {
			System.out.println(m);
		}
	}
	public double somarReais() {
		double totalGeral = 0;
		for(Moeda m : listaMoedas) {
			totalGeral = totalGeral + m.converter();
			
		}
		return totalGeral;
	}
	
	public void encerrar() {
		
	}
	public void converter() {
		
	}
	

}