
public class evenOdd {
	public static void main(String[]args) {
		 int [] arr = {10,20,40,50};
		 
		 int even = 0;
		 int odd = 0;
		 
		 for (int num :arr) {
			 if(num %2 ==0) {
				 even++;
			 }else {
				 odd++;
			 }
		 }
		 
		 System.out.println("even number = " + even);
		 System.out.println("odd number = " + odd);

	}

}
