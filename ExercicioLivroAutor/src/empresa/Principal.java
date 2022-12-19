package empresa;

public class Principal {
	
	
	public static void main(String[] args) {
		
		LivroFisico livroA = new LivroFisico("Sherlock",
							new Autor("Arthur Conan","Britânico","bla@bla.bla"),
							"Investigação",
							5,
							2000,
							2500);
		LivroDigital livroB = new LivroDigital("Senhor dos Aneis",
				new Autor("Sei lá","piorou","blu@blu.blu"),
				"Pergunta pra ele",
				2,
				1000,
				3200);
		
		Livro livro;
		
		livro = livroA; //Aqui não estamos instanciando mas referenciando
		
		livro.info();
		
		System.out.println();
		
		livro = livroB;
		
		livro.info();
		
		
				
	}
	

}
