
public class example {
	public static void  main(String[]args) {
		try {
			int result = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("error is occured");
		}
		
		finally {
			System.out.println("this is always run");
		}
	}

}
