package com.java.programs.sorting;

public class Quick {
	
	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	    	
	        int partitionIndex = partition(arr, begin, end);
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
		
		private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;

	}

		

		 void display(int arr[])                 //display the array
		    {  
		        for (int i=0; i<arr.length; i++) 
		        {
		            System.out.print(arr[i]+" ");
		        } 
		    } 
		     
		    public static void main(String[] args)
		    {
		    	Quick ob = new Quick();
		        int arr[] = {6, 1, 0, 15, -1, 4, 1, 3, 4, 5, 1, 2, 3, 1, 2, 1, 3, 1, -2, 2 , 4, 5, 12, 2, 100, 50, 11, 9};    
		        quickSort(arr,0,arr.length -1);
		        ob.display(arr);
		    }


}
