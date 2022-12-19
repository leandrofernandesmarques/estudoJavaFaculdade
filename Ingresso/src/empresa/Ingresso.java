package empresa;

public class Ingresso {
	
	public String NomeEvento;
	public double valor;
	
	
	void info() {
		System.out.println("Nome do Evento: " + NomeEvento);
		System.out.println("Valor: " + valor);
		
	}
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		NomeEvento = nomeEvento;
		this.valor = valor;
		}
	

	
}
