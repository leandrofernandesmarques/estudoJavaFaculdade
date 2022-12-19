package empresa;

import java.util.Objects;

public class Moeda {
	
	double valor;
	
		

	public Moeda(double valor) {
		super();
		this.valor = valor;
		
	}
	
	
	double converter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	double total() {
		return 0;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
	
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}


		double somar() {
			// TODO Auto-generated method stub
			return 0;
		}
	
	

}
