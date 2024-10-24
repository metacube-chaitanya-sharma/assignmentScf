package assignment4.ques2;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchService service = new SearchService();
		
		int[] arr = {1,2,3,4,5}; 
		
		System.out.println("index " + service.linearSearch(arr,  4, 5)); 
		System.out.println("index " + service.binarySearch(arr,  0, 5)); 
	}

}
