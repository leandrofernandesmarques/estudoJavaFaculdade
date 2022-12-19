package empresa;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	/* 
	-----------------------------------------------------------
	Com o Eclipse podemos criar construtores de maneira fácil:
	Menu Source -> Generate Constructor using Fields. Resultado
	abaixo:
	------------------------------------------------------------
	*/
	public Aluno(int matricula) {
		super();
		this.matricula = matricula;
		this.nome = "Vazio";
		this.cpf = "000.000.000-0";
	}

	
	Aluno(){//Pelo que entendi é obrigado isso. 
		System.out.println("Aluno criado sem parâmetros");
	}
	
/* CONSTRUTOR*/Aluno(int matricula, String nome, String cpf){
/* Atributo*/this.matricula = matricula;/* Parâmetro*/
/* Atributo*/this.nome = nome;/* Parâmetro*/
/* Atributo*/this.cpf = cpf;/* Parâmetro*/
			}


			
	
	void info() {//Isto é um método. Objetivo: Imprimir na tela
		System.out.println("Matricula:" + matricula);
		System.out.println("Primeiro Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
		
	


}

}

