package switchcase_Practice;

public class Atm_inquiry {
	public static void main(String[]args) {
		int bal = 3;
		switch(bal) {
		case 1:
			System.out.println("Check balance");
			break;
		case 2:
			System.out.println("Withdraw Money");
			break;
		case 3:
			System.out.println("Deposit money");
			break;
			default:
				System.out.println("Exit");
			
		}
		
	}

}
