public class ExceptionTest {
	public static void main(String [] args) {
		
		division(1,3);
		
		
	}
	
	public static void division(int num1, int num2) {
		int num;
		
		try {
			if(num1 > num2){
				num = num1 % num2;
			}
			else {
				num = num2 % num1;
			}
			System.out.println(num);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}


	}

}