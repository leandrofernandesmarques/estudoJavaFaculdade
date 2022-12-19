package empresa;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		int tipoMoeda;
		Moeda moeda = null;
		
		Scanner input = new Scanner(System.in);
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("COFRINHO");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("0 - Ecerrar");
		opcao = input.nextInt();
		
		while (opcao != 0) {
			switch(opcao) {
			
			case 1://Adicionar
				tipoMoeda = 0;
				while (tipoMoeda > 3  || tipoMoeda <= 0) {
				
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				tipoMoeda = input.nextInt();
				
				}
							
				if (tipoMoeda == 1) {
					System.out.println("Você escolheu Dolar. Qual é o Valor? ");
					double valorMoeda = input.nextDouble();
					moeda = new Dolar(valorMoeda);
				}
				if (tipoMoeda == 2) {
					System.out.println("Você escolheu Euro. Qual é o Valor?");
					double valorMoeda = input.nextDouble();
					moeda = new Euro(valorMoeda);
				}
				if (tipoMoeda == 3) {
					System.out.println("Você escolheu Real. Qual é o Valor?");
					double valorMoeda = input.nextDouble();
					moeda = new Real(valorMoeda);
				}
				cofrinho.adicionar(moeda);
				break;
			
			case 2://Remover
				tipoMoeda = 0;
				while (tipoMoeda > 3  || tipoMoeda <= 0) {
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				tipoMoeda = input.nextInt();
				
				}
							
				
				if (tipoMoeda == 1) {
					System.out.println("Você escolheu Dolar. Valor a Remover: ");
					double valorMoeda = input.nextDouble();
					moeda = new Dolar(valorMoeda);
				}
				if (tipoMoeda == 2) {
					System.out.println("Você escolheu Euro. Valor a Remover:");
					double valorMoeda = input.nextDouble();
					moeda = new Euro(valorMoeda);
				}
				if (tipoMoeda == 3) {
					System.out.println("Você escolheu Real. Valor a Remover:");
					double valorMoeda = input.nextDouble();
					moeda = new Real(valorMoeda);
				}
				cofrinho.remover(moeda);
				break;
				
				
			case 3://Listar
				System.out.println();
				System.out.println("------------ MOEDAS NO COFRINHO --------------");				
				cofrinho.listar();
				System.out.println("----------------------------------------------");
				System.out.println();
				
				break;
				
				
			case 4://Total Convertido
				System.out.println();
				System.out.println("------------ TOTAL EM REAIS ------------------");	
				System.out.println();
				System.out.println(cofrinho.somarReais());
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println();
				
				break;
				
			default:
				System.out.println("Opção Inválida:");
				
			
			}
			
			System.out.println("COFRINHO *");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido para Real");
			System.out.println("0 - Ecerrar");
			opcao = input.nextInt();
			
		}
		if (opcao == 0) {
			System.out.println("------------ Programa Encerrado. --------------");					
			
		}
		
		
		
	}

}
