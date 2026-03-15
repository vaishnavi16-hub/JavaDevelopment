package switchcase_Practice;

public class fruitMenu {
	public static void main (String[]args) {
		int fruit = 4;
		
		switch(fruit) {
		case 1:
			System.out.println("Apple price = 100");
			break;			
		case 2:
			System.out.println("Mango price = 65");
			break;
		case 3:
			System.out.println("Banana price = 70");
			break;
		case 4:
			System.out.println("Oranage price = 80");
			break;
			default:
				System.out.println("Invalid fruits...!");
		}
		
	}

}
