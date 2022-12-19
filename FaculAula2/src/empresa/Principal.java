package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
	//----------------------------------------------
		System.out.println("Aluno Impresso sem Classe");
		Aluno a = new Aluno();
		/* atributo*/ a.matricula = 1001;/* estado*/
		/* atributo*/a.nome = "Super Mario";/* estado*/
		/* atributo*/a.cpf = "111222333-44";/* estado*/
		
		System.out.println("Matricula:" + a.matricula);
		System.out.println("Nome: " + a.nome);
		System.out.println("CPF: " + a.cpf);
		System.out.println(); 
	//------------------------------------------------
		
		a.nome = "Super Luigi";
		System.out.println("Troca de Aluno");
		a.info();//Usando o método "info()" da classe Aluno
	//-------------------------------------------------------	
				
		Aluno b = new Aluno();
		/* atributo*/ b.matricula = 1002;/* estado*/
		/* atributo*/b.nome = "Yoshi";/* estado*/
		/* atributo*/b.cpf = "333.444.555-98";/* estado*/
		
	//-------------------------------------------------------	
		System.out.println(); 
		b.info();//Aqui a mesma coisa, mas considerando 
		//os atributos do objeto b.
	//------------------------------------------------------------	
		//PASSAGEM DE ATRIBUTOS PELO "CONSTRUTOR" (da Classe Aluno)
		Aluno c = new Aluno(1003,"Peach","222.222.222.23");
		
		System.out.println();
		c.info();//Aluno criado (Instanciado) pelo CONSTRUTOR
	//-------------------------------------------------------------
		
		//PASSAGEM DE ATRIBUTOS PELO "CONSTRUTOR" Somente matrícula
		Aluno d = new Aluno(1004);
		
		System.out.println();
		d.info();
	//--------------------------------------------------------------	
		//ARRAY LIST
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(d);
		alunos.add(new Aluno (1005, "Bowser","888.888.999.9"));
		
		
	//-------------------------------------------------------------	
		//Vamos criar(instanciar) uma nova turma:
		Turma turmaA = new Turma(); //Agora turmaA é uma nova turma
		turmaA.prof = new Professor();//Agora a TurmaA tem o objeto professor
		turmaA.prof.nome = "Leonardo";//O professor da Turma é o Leonardo
		turmaA.alunos = new ArrayList<>();//A turmaA tem uma lista de alunos
		turmaA.alunos.add(new Aluno());//A turmaA tem um novo Aluno
		turmaA.alunos.get(0).nome = "Super Mario";//A turmaA tem o Aluno Super Mario
		
		
		
		

	}
}
