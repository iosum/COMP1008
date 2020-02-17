public class SimpleTryCatch{
	public static void main(String [] args) {
		try {
			int [] nums = new int[2];
			System.out.println("Access the element " + nums[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}
	
}