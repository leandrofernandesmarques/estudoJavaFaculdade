package Empresa;

public class Principal {

	public static void main(String[] args) { 
		
		/*Funcionario f1 = new Assalariado ("Mario",3500);//Aqui f1 é Assalariado (Nome,Salário)
		
		f1 = new Horista("Luigi",100,40.5f);//Aqui f1 é Horista (Nome,horas, valorHoras);
		*/		
		Funcionario funcionarios[] = {new Assalariado("Mario",3500),
									  new Horista("Luigi", 100, 40.5f),
									  new Comissionado("Yoshi",50000,0.05f)};
		
		Funcionario f;
		float total = 0;
		for (int i = 0 ;  i < funcionarios.length;i++) {
			f = funcionarios[i];
			System.out.println(f.nome + " Salário: " + f.pagamento());
			total += f.pagamento();
			
		}
		System.out.println("Total: " + total);


	}

}
