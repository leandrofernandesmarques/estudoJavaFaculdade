package empresa;

public class Livro {
	
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	//Observe que quando falamos de "titulo" existe o atributo titulo (Acima)
	//e o parâmetro título(abaixo)ou seja ambíguo. Nestes casos usamos o this
	public Livro (String titulo, String autor) {
		this.titulo = titulo;//Este título (atributo) é = ao titulo (atributo)
		this.autor  = autor;
		
	}
	
	public float lucro() {
		return precoVenda - custoProducao;		
	}
	public void imprimirTitulo() {
		System.out.println("O titulo: " +titulo);
	}
	public float imposto() {
		return 0.2f * lucro();
	}
	

}
