
public class EmployeeDetails {
	
	public static void main(String[]args) {
		Employee e = new Employee();
		System.out.println("Employee information.......!");
//		e.setEmpId(13);
		e.setName("rahul");
		e.setSalary(45000);
		
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("Employe Name = " +e.getName());
		System.out.println("Employee Salary = " + e.getSalary());
		
		System.out.println("---------------------->");
		
		Employee e1 = new Employee();
//		e.setEmpId(12);
		e1.setName("vaishnavi");
		e1.setSalary(234565);
		
		System.out.println("Employee information 2.......!");

		System.out.println("Employee Name = "+e.getName());
		System.out.println("Employee salary = "+e.getSalary());

	}

}
