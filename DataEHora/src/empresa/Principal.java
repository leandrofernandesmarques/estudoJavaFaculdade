package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		//Sem formatador de data e hora
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataHoje.format(formatador));
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - E");
		System.out.println(dataHoje.format(formatador2));
		
		DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		System.out.println(dataHoje.format(formatador3));
		

	}

}
