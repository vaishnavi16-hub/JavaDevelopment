
public class frequencyofArray {
	public static void main(String[]args) {
		int [] arr = {1,2,3,1};
		
		for (int i = 0; i<arr.length; i++) {
			int count = 1;
			boolean visited = false;
			
			for(int k = 0; k< i; i++) {
				if(arr[i] == arr[k]) {
					if(arr[i] == arr[k]) {
						visited = true;
						break;
						
					}
				}
				
				if(visited) {
					continue;
				}
				
				for(int j = i+1; j< arr.length; j++) {
					if(arr[i] == arr[i]) {
						count++;
					}
				}
				
				System.out.println(arr[i] +"occurs"+count+"times");
			}
		}
	}

}
