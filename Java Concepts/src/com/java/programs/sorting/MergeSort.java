package com.java.programs.sorting;

public class MergeSort {
	
	private static void merge(int[] nums,int low, int mid, int high){
		
		// calculating lengths
        int n = mid - low + 1 ;
        int m = high - mid;
        
        // creating temporary subarrays
        int[] left = new int[n];
        int[] right = new int[m];
        
        // copying our sorted subarrays into temporaries
        
        for(int i=0;i<n;i++)
            left[i] = nums[low+i];
        
        for(int i=0;i<m;i++)
            right[i] = nums[i+mid+1];
        
     // iterators containing current index of temp subarrays
        
       int i=0;
       int j=0;
       
    // copying from leftArray and rightArray back into array
   // if there are still uncopied elements in R and L, copy minimum of the two
        int k = low;
        while(i<n && j<m){
            if(left[i]<right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        
        // if all the elements have been copied from rightArray, copy the rest of leftArray
        while(i<n)
            nums[k++] = left[i++];
        
        // if all the elements have been copied from leftArray, copy the rest of rightArray
        while(j<m)
            nums[k++] = right[j++];
        
    }
    
    private static void sort(int[] nums, int low, int high ){
        if(low<high){
        	
            int mid = low + ((high - low) / 2 );
            
            sort(nums,low,mid);
            sort(nums,mid+1,high);
            merge(nums, low, mid, high);
        }
    }
    
    public static int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
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
    	MergeSort ob = new MergeSort();
        int arr[] = {6, 1, 0, 15, -1, 4, 1, 3, 1, 2, 3, 1, 2, 1, 3, 1, -2, 2 , 4, 5, 12, 2, 100, 50, 11, 9};    
        sortArray(arr);
        ob.display(arr);
    }

}
