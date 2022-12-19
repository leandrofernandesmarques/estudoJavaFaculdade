package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		double peso = 60;
		String nome = "";
				
		Scanner input = new Scanner(System.in);
		
				
		if(idade < 18) {
			System.out.println ("Acesso bloqueado");
			
		}
		else if (idade < 65) {
			System.out.println ("Adulto");
			
		}
		else {
			System.out.println ("Adulto Idoso");
		}
		for (int i=0; i<10; i++) {
			System.out.println("Valor: " +i);
		}
			

	}

}
