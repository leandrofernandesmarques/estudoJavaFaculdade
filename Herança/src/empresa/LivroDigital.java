package empresa;

//O extends Livro captura todos os dados da classe Livro
public class LivroDigital extends Livro {
	
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigital (String titulo, String autor, String linkDownload) {
		super (titulo, autor);
		this.linkDownload = linkDownload;
	}
	
	public float imposto() {
		return 0.2f * lucro() + 2;//20% do lucro + 2
		//Aqui poderia ser super.imposto() + 2;
	}
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	
	public void imprimirImposto() {
		System.out.println("Imposto livro Físico" + super.imposto());//Chama da classe mãe(super)
		System.out.println("Imposto livro Digital" + imposto());//chama o imposto da clase filha (esta que estamos)
		//Aqui também poderia ser: + this.imposto, opcional, e fica mais claro.
	}

}
