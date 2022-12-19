package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Nota mario = new Nota();
		
		
		Nota luigi = new Nota(2,5,5);
		System.out.println("Média Luigi");
		luigi.resultado();
		System.out.println();
		
		
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);
		
		mario.resultado();
		
		mario.setNota1(2);//alteração de primeira nota p/ 2
		mario.setFaltas(10);
		
		mario.resultado ();
		

	}

}
