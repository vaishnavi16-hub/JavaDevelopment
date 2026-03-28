
public class bankMain {
	public static void main(String[]arg) {
		
		Bank b = new Bank();
		b.setdepositeamount(20000);
		b.setwithdrawamount(40000);
		
		
		System.out.println("Bank details.........");
		System.out.println("Deposite amount = "+ b.getdepositeamount());
		System.out.println("Deposite amount = "+ b.getwithdrawamount());
	}

}
