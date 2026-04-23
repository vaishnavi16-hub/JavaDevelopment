
public class noException {

	public static void main(String[]args) {
		try {
			String s = "a bc";
			int num = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("invalid number format");
		}
	}
}
