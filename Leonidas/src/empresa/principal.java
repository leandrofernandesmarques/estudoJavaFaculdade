package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		int palpite;
		int valorCorreto = 10000;
		
		System.out.println("Digite um palpite: ");
		palpite = input.nextInt();
		
		while (palpite != valorCorreto) {
			if(palpite > valorCorreto) {
				System.out.println("Um pouco menos..");
			}
			else {
				System.out.println("Um pouco mais..");
			}
			System.out.println("Digite outro palpite: ");
			palpite = input.nextInt();
				
		}
		System.out.println("Acertô miseravi!! ");

	}

}
