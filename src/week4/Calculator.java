public class Calculator {
	public int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subtraction(int n1, int n2) {
		if(n1 > n2) {
			return n1 - n2;
		}
		else {
			return n2 - n1;
		}
	}
	
	public int multiplication(int n1, int n2) {
		return n1*n2;
	}
	
	public int division(int n1, int n2) {
		if(n1 > n2) {
			return n1 / n2;
		}
		else {
			return n2 / n1;
		}
	}
	
	
	public double addition(double n1, double n2) {
		return n1 + n2;
	}
	
	public double subtraction(double n1, double n2) {
		if(n1 > n2) {
			return n1 - n2;
		}
		else {
			return n2 - n1;
		}
	}
	
	public double multiplication(double n1, double n2) {
		return n1*n2;
	}
	
	public double division(double n1, double n2) {
		if(n1 > n2) {
			return n1 / n2;
		}
		else {
			return n2 / n1;
		}
	}
}