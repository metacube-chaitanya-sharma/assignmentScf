package assignment4.ques2;

public class SearchService {
	
	/**
	 * 
	 * @param arr
	 * @param num
	 * @param size
	 * @param i
	 * @return
	 */
	public int linear(int arr[] , int num , int size , int index) {
		
		if(index>size-1) {
			return -1; 
		}
		
		if(arr[index] == num) {
			return index; 
		}
		return linear(arr , num , size ,index+1);
	}
	
	/**
	 * 
	 * @param arr
	 * @param num
	 * @param startIndex
	 * @param endIndex
	 * @return 
	 */
	public int binary(int arr[] , int num , int startIndex  , int endIndex ) {
		
		
		if(endIndex >= startIndex && startIndex <= arr.length-1) {
			
		int mid = (startIndex + endIndex)/2; 
		if(arr[mid] == num) {
			return mid; 
		}
		else if(arr[mid] > num) {
			return binary(arr , num , startIndex , mid-1); 
		}
		else {
			return binary(arr , num , mid+1 , endIndex);
		}
		}
		
		return -1; 
	
		
		
	}
	
	/**
	 * 
	 * @param arr
	 * @param numberToFind
	 * @param size
	 * @return the index of the element to find
	 */
	public int linearSearch(int arr[] , int numberToFind , int size ) {
		
		return linear(arr ,numberToFind , size , 0);
		
		
	}
	
	/**
	 * 
	 * @param arr
	 * @param numberToFind
	 * @param size
	 * @return the index of the element to find 
	 */
	public int binarySearch(int arr[] , int numberToFind , int size) {
		
		
		return binary(arr, numberToFind , 0 , size-1);
	}

}
