
public class findNo {
	
	public static void main(String[]args) {
		int [] arr = {10,30,0,59};
		int key  = 30;
		
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				found = true; 
				break;
			}
		}
		
		if (found) {
			System.out.println("Element found");
		} else {
			System.out.println("element not found");
		}
	}

}
