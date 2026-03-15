package switchcase_Practice;

public class switch_ArithmeticOperations {
	public static void main (String[]args) {
		
		int a = 2;
		int b = 3;
		char operations = '4';
		switch(operations) {
		case '+':
			System.out.println("Addition ="+(a+b));
			break;
		case '-':
			System.out.println("Subtraction ="+(a-b));
			break;
		case '*':
			System.out.println("Multiplication ="+(a*b));
			break;
		case 4:
			default:
			System.out.println("Invalid operatons..!");
			
			
		}
	}

}
