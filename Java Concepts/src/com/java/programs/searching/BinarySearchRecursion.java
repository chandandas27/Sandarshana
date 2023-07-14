package com.java.programs.searching;

public class BinarySearchRecursion {
	
	 private static int binarySearch(int numArray[], int key, int low, int high) {
   
	        if  (low <= high ) {
	        	
	        	int mid = low  + (high - low) / 2;

	            
	            if (key == numArray[mid]){
	                return mid;
	            }
	            
	            else if (key < numArray[mid]){
	            	
	            	return binarySearch( numArray,  key, low, mid-1);
	            	    
	            }
	            
	            else {
	            	
	            	return binarySearch( numArray,  key,  mid+1, high);
	              
	            }
   
	        }
	        
	        return -1;
	      
	  }
	    public static void main(String args[]) {
	        
	        int[] arrayofnums = {2,3,6,8,9,13,20,30,46,50,59,70,90,100,102,200,300,454};
	        
	        int low = 0;
	        int high = arrayofnums.length -1;
	        System.out.println(binarySearch(arrayofnums, 300, low, high));
	        
	    }


}
