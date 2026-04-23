
public class exceptionHandling {

	public static void main(String[]args) {
		try {
			int arr[] = {10,20,30};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of the range");
		}
		System.out.println("program  continuous");
	}
}
