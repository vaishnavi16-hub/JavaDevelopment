package switchcase_Practice;

public class switch_vacation {
	public static void main (String[]args) {
		int months = 6;
		switch(months) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;
			
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Mansoon");
			break;
			default:
				System.out.println("Inavalid monmths");
		}
	}

}
