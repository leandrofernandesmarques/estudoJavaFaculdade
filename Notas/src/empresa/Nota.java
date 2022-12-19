package empresa;
//)__________________________________________________
public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
//____Construtores____________________________________	
//____Construtou Vazio________________________________
	
	public Nota() {
		
	}
	
//____Construtor Criado no Source _______________________________	
	
	/*
	public Nota(double nota1, double nota2, int faltas) {
		super();
		//this.nota1 = nota1;
		this.nota2 = nota2;
		this.faltas = faltas;
	}*/	
	
//____Construtor Alterado para set(sujeitos as mesmas regras) _______________________________	
		
		public Nota(double nota1, double nota2, int faltas) {
			super();
			setNota1(nota1);
			setNota1(nota2);
			setFaltas(faltas);
		}	
		
		
//__Set Nota1_____________________________________________	
	public void setNota1(double nota) {
		if (nota<0 || nota >10) {
			System.out.println("Nota Inválida");
			return;
		}
			
		nota1 = nota;		
	}

//__Set Nota2______________________________________________	
	
	public void setNota2(double nota) {
		if (nota<0 || nota >10) {
			System.out.println("Nota Inválida");
			return;
		}
			
		nota2 = nota;
	}
	
//___Get Nota 1 e 2_______________________________________________	
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;

	}
	
	
//__Set e Get Faltas________________________________________________	
	
	public int getFaltas() {
		if (faltas > 40 || faltas < 0) {
			System.out.println("Número de Faltas inválido");
		}
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
//__Impressão de resultado__________________________________________________
	
	void resultado() {
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média foi: " + media);
		
		if (faltas > 7) {
			System.out.println("Reprovado por Faltas");
			
		}
		
		
		else if(media < 4) {
			System.out.println("Reprovado por Nota");
		}
		
		else if(media < 7) {
			System.out.println("Esame Final");
		} 
		else {
			System.out.println("Aprovado.");
		}
	}
//_____________________________________________________
}
