
public class minimumNO {
  public static void main(String[]args) {
	
	  int[] arr = {10,20,40,50};
	  int minimum = arr[0];
	  
	  for(int num :arr) {
		  if(num< minimum) {
			  minimum = num;
		  }
	  }
	   System.out.println("minimum element = "+ minimum);
  }
}
