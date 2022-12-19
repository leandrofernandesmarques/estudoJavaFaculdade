package Empresa;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		
		System.out.println("Por favor, digite peso e altura: ");
		Scanner input = new Scanner(System.in);
		peso = input.nextDouble();
		altura = input.nextDouble();
		
		imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f",imc);
		
		

	}

}
