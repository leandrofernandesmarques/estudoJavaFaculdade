package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Desktop compA = new Desktop(8,4,600);
		NoteBook compB = new NoteBook(8,4,15);
		
		Computador comp;//Polimorfismo
		
		comp = compA;//Polimorfismo
		System.out.println("Valor: " + comp.calculaValor());//Valeu a pena criar um metod abstrato
		
		System.out.println("****************");
		
		comp = compB;//Polimorfismo
		System.out.println("Valor: " + comp.calculaValor());//Valeu a pena criar um metod abstrato
		
		
	}
		
}
