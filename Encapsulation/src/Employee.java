
public class Employee {
	
//	first declared variable as private..
	private int empId;
	private String name;
	private double salary;
	
	
	
//	generate  public getter nad setter of this variables
	
	public int getEmpId() {
		return empId;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;

	}
	
	public double getSalary(){
		return salary;
		
	}
}
