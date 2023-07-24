package com.java.programs.sorting;

public class Merge {
	
	public static void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	    
	    // copying our sorted subarrays into temporaries

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	    merge(a, l, r, mid, n - mid);
	}

		public static void merge( int[] a, int[] l, int[] r, int left, int right) {
			
		    
		    // copying from leftArray and rightArray back into array
		   // if there are still uncopied elements in R and L, copy minimum of the two
	 
	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    
	    // if all the elements have been copied from rightArray, copy the rest of leftArray
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    
	    while (j < right) {
	        a[k++] = r[j++];
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
		    	Merge ob = new Merge();
		        int arr[] = {6, 1, 0, 15, -1, 4, 1, 3, 1, 101 ,2, 3, 1, 2, 1, 3, 1, -2, 2 , 4, 5, 12, 2, 100, 50, 11, 9};    
		        mergeSort(arr,arr.length);
		        ob.display(arr);
		    }


}
