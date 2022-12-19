package empresa;

enum Estacao {
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

public class Roupa {
	String modelo;
	int tamanho;
	Estacao colecao;
	
	public Roupa(String modelo, int tamanho, Estacao colecao) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	
	public void msg() {
		switch (colecao) {
		
		case VERAO:
			System.out.println("Arrase na praia");
			break;
		case OUTONO:
			System.out.println("Passe o Outono com elegância");
			break;
		case INVERNO:
			System.out.println("Se agasalhe com estilo");
			break;
		case PRIMAVERA:
			System.out.println("A estação das flores");
			break;
		
		}
		
	}
		
}
