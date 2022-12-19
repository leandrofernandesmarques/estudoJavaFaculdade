package empresa;
//Esta classe é filha/subclasse de Livro
public class LivroFisico extends Livro {
	
	private int tiragem;
	private int peso;
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso) {
		super(titulo, autor, genero, edicao);
		this.tiragem = tiragem;
		this.peso = peso;
	}
	public LivroFisico() {
		
	}
	@Override //Indica "sobrescrita". O java entende que é uma sobrescrita e não compila se não estiver tudo certo
	public void info() {
		super.info();//Aqui estamos chamando o método info da classe mãe. Evitando replicar código)
		//Abaixo vamos adicionar o que não tem no metodo info da classe mãe
		System.out.println("Peso:  " + peso);
		System.out.println("Tirangem: " + tiragem);
		
	}
		
	
}
