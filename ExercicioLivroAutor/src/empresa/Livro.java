package empresa;

public abstract class Livro {
	
	protected String titulo;
	protected Autor autor;
	protected String genero;
	protected int edicao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public Livro(String titulo, Autor autor, String genero, int edicao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
	}
	public Livro() {
		
	}
	
	void info() {
		System.out.println("Titulo " + titulo);
		System.out.println("Genero " + genero);
		System.out.println("Edicao " + edicao);
		System.out.println("Autor Nome: " + autor.getNome());
		//Autor tem 3 parametros, temos que dizer qual queremos
		//Podemos usar aqui o "autor.info();" já que criamos o info na classe autor
	}
	
	

}
