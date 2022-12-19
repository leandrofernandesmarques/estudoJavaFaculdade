package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		//ArrayList<String> pessoas = new ArrayList();
		LinkedList<String> pessoas = new LinkedList();
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas.get(0));//Pega pos0 - Mario
		//pessoas.remove(1);//para remover pos1 - Luigi
		
		System.out.println("Ordem Original:");
		System.out.println(pessoas);
		System.out.println();
		
		Collections.sort(pessoas);
		System.out.println("Ordem Alfabética");
		System.out.println(pessoas);
		System.out.println();
		
		Collections.shuffle(pessoas);
		System.out.println("Ordem Aleatória (sempre muda na execução:");
		System.out.println(pessoas);
		System.out.println();
		
		Collections.reverse(pessoas);
		System.out.println("Ordem Reversa");
		System.out.println(pessoas);
		System.out.println();
		
		Collections.min(pessoas);
		System.out.println("Mínimo");
		System.out.println(pessoas);
		System.out.println();
		
	
		System.out.println(Collections.max(pessoas));
		System.out.println();
		
		System.out.println(Collections.min(pessoas));
		

	}

}
