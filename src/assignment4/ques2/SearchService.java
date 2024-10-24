package assignment4.ques2;

public class SearchService {
	
	public int linear(int arr[] , int num , int size , int i) {
		
		if(i>size-1) {
			return -1; 
		}
		
		if(arr[i] == num) {
			return i; 
		}
		return linear(arr , num , size ,i+1);
	}
	
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
	
	public int linearSearch(int arr[] , int numberToFind , int size ) {
		
		return linear(arr ,numberToFind , size , 0);
		
		
	}
	
	public int binarySearch(int arr[] , int numberToFind , int size) {
		
		
		return binary(arr, numberToFind , 0 , size-1);
	}

}
