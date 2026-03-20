
public class EmployeeDta {
	public static void main(String[]args) {
//		create object
		
		Employee e1 = new Employee();
		
		
//		Assign values
		
		e1.id = 1234;
		e1.salary = 70000;
		
		if(e1.salary >4000) {
			System.out.println("High salary...!");
		}else {
			System.out.println("Low salary...!");
		}
		
	}

}
