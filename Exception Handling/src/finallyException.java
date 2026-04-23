
public class finallyException {
public static void main(String[]args) {
	try {
		System.out.println("connecting to the database");
		int result = 10/0;
	}
	catch (Exception e) {
		System.out.println("error occured while working with database");
	}
	finally {
		System.out.println("database connection closed");
	}
  }

}
