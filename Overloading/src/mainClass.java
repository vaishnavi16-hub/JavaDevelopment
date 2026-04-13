
public class mainClass {
	public static void main(String[]args) {
		
		methodOverloading  mo = new methodOverloading();
//		System.out.println(mo.add(2,4));
//		System.out.println(mo.add(2, 5,6));
		
		System.out.println("this is methos 2");
	}

	
	
	Amazon o = new Amazon();
	o.orderPlaced("Mobile Phone");
	o.orderPlaced("Mobile Phone", 2);
	o.orderPlaced("Mobile Phone", 4, 560000);
  }
}
