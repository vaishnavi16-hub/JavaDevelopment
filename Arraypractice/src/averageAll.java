
public class averageAll {
  public static void main(String[]args) {
	  int [] arr = {10,30,40,50};
	   
	  
	  int sum = 0;
	  for (int num :arr) {
		  sum = sum +num;
	  }
	  
	  int avg = sum /arr.length;
	  System.out.println("Average= "+ avg);
  }
}
