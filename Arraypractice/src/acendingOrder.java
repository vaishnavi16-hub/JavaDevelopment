import java.util.Arrays;

public class acendingOrder {
	
	public static void main(String[]args) {
		int [] arr = {5,3,9,1,6};
		
		Arrays.sort(arr);
		System.out.println("acending order");
		for( int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

