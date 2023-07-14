package com.java.programs.searching;

public class BinarySearch {
	
	 private static int binarySearch(int numArray[], int key) {
	        int low = 0;
	        int high = numArray.length - 1;
	        
	        while (low <= high) {
	        	
	            //int middleIndex = (low + high) / 2;
	            
	           /**Notice how the middle index is generated (int mid = low + ((high – low) / 2). 
	            * This to accommodate for extremely large arrays. 
	            * If the middle index is generated simply by getting the middle index (int mid = (low + high) / 2), 
	            * an overflow may occur for an array containing 2^30 or
	            * more elements as the sum of low + high could easily exceed the maximum positive int value.
	           
	           **/
	        	
	            int middleIndex = low  + (high - low) / 2;
	            
	            
	            int middleIndexNumber = numArray[middleIndex];
	            
	            if (key == middleIndexNumber){
	                return middleIndex;
	            }
	            else if (key < middleIndexNumber){
	                high = middleIndex - 1;
	            }
	            else if (key > middleIndexNumber){
	                low = middleIndex + 1;
	            }
	        }
	        
	        return -1;
	  }
	    public static void main(String args[]) {
	        
	        int[] arrayofnums = {2,3,6,8,9,13,20,30,46,50,59,70,90,100,102,200,300,454};
	        
	        System.out.println(binarySearch(arrayofnums, 3));
	        
	    }


}
