package empresa;

public class Principal {

	public static void main(String[] args) {
		int[] numeros = {1,2,3};
		
		try {
			numeros[0] = numeros[0]/0;
			System.out.println(numeros[10]);
			
			
		} 
		//Exceção Específica:
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Valor fora do limite. " + e.getMessage());
			return;
		}
		//Qualquer Exceção (Genérica)
		catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		finally {//finally é sempres executado!! Com erro ou sem.
			System.out.println("Finalizando programa");
		}

	}

}
