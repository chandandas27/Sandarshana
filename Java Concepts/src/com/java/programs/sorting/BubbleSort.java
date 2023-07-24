package com.java.programs.sorting;

public class BubbleSort {
	
	
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	
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
	        BubbleSort ob = new BubbleSort();
	        int arr[] = {6, 1, 0, 15, -1, 4, 1, 3, 1, 2, 3, 1, 2, 1, 3, 1, 2 , 4, 5, 12, 2, 100, 50, 11, 9};    
	        bubbleSort(arr);
	        ob.display(arr);
	    }
}
