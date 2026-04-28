
public class maximunNo {
	public static void main(String[]args) {
		int [] arr = {10,30,40,50};
		 int maximum = arr[0];
		 
		for (int num : arr) {
			if(num> maximum) {
				maximum = num;
			}
		}
		
		System.out.println("maximum element = " + maximum);
	}

}
