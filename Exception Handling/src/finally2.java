
public class finally2 {
public static void main(String[]args) {
	try {
		System.out.println("opening file");
//		System.out.println("Reading file");
	}
	catch (Exception d) {
		System.out.println("error file reding file");
	}
	finally {
		System.out.println("File closed");
	}
}
}
