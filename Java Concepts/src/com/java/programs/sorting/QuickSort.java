package com.java.programs.sorting;

public class QuickSort {
	
	static int partition(int[] array, int begin, int end) {
	    int pivot = end;

	    int counter = begin;
	    for (int i = begin; i < end; i++) {
	        if (array[i] < array[pivot]) {
	            int temp = array[counter];
	            array[counter] = array[i];
	            array[i] = temp;
	            counter++;
	        }
	    }
	    int temp = array[pivot];
	    array[pivot] = array[counter];
	    array[counter] = temp;

	    return counter;
	}

	public static void quickSort(int[] array, int begin, int end) {
	    if (end <= begin) return;
	    int pivot = partition(array, begin, end);
	    quickSort(array, begin, pivot-1);
	    quickSort(array, pivot+1, end);
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
	    	QuickSort ob = new QuickSort();
	        int arr[] = {6, 1, 0, 15, -1, 4, 1, 3, 1, 2, 3, 1, 2, 1, 3, 1, -2, 2 , 4, 5, 12, 2, 100, 50, 11, 9};    
	        quickSort(arr,0,arr.length-1);
	        ob.display(arr);
	    }

}
