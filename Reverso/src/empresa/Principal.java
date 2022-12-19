package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/* Para criar uma ArrayList com inteiros, use a classe "Integer" (não é aceito tipos primitivos)
		 * dentro do operador de diamante <> ficando assim:
		 * ArrayList <String> listaNomes = new ArrayList <String>();*/ 
		
		ArrayList <String> listaNomes = new ArrayList <String>();
		
		
		
		System.out.println("Digite a quantidade de nomes");
		int quantidade = input.nextInt();
		
		String nome;
		for (int i=0 ; i < quantidade ; i++) {
			nome = input.next();
			listaNomes.add(nome);
						
		}
		
		System.out.println("Ordem Normal: ");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		System.out.println("Ordem Reversa: ");
		System.out.println(listaNomes);
		
		
		

	}

}
