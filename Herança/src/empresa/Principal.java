package empresa;

public class Principal {
	
	public static void main(String[] args) {
		//Lembrando: Abaixo ele chama um construtor. Se não criarmos ele chama um vazio por debaixo dos panos).
		//Vamos criar um construtor na classe livro e acessar por aqui.		
		Livro l1 = new Livro("Sherlock Homes" , "Sir Arthur Conan Doyle");
		l1.imposto();//Aqui ele puxa o imposto da super classe
		
		//Lembremos que esse contrututor está em LivroDigital
		//Ele herda o tipo também, então também é do tipo "livro"
		LivroDigital l2 = new LivroDigital("Sherlock Homes" , "Sir Arthur Conan Doyle","https:\\blablabla.com");
		l2.imposto();//Aqui ele puxa o imposto da classe filha
		
		//Vamos entender quem é instância de quem:
		System.out.println(l1 instanceof Livro);//true
		System.out.println(l2 instanceof Livro);//true
		System.out.println(l1 instanceof LivroDigital);//false
		System.out.println(l2 instanceof LivroDigital);//true
		
		
	}
	
	
}
