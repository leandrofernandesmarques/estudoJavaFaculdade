package Empresa;

public abstract class Funcionario {
	
	String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract float pagamento(); //Não precisa inventar um metodo como no exercício do polimorfismo
	
	

}


