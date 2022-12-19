package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		double peso = 60;
		String nome = "";Text
				
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
		
		for (int i=0; i < 10; i++) {
			System.out.println("Valor: " + i);
		}
		//array
		int megasena[] = {11,14,21,30,37,56};
		int numeros [] = new int [200];
		
		numeros[60] = 50;
		megasena [0] = 10;
		
		System.out.println ("Megasena:" + megasena);

	}

}
