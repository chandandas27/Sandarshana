package com.java.programs.strings;

import java.util.HashMap;

public class FrequencyCount {
	
		   public static void main(String[] args) {
			   
		      String str = "abbababbhcccdgfgfj";
		 
		      HashMap<Character,Integer> charCount = new HashMap<>();
		      
		      for(int i = 0 ; i < str.length(); i++) {
		    	  
		          Character ch = str.charAt(i);
		         
		         if(charCount.containsKey(ch)) {
		        	 
		            int count = charCount.get(ch);
		            
		            charCount.put(ch, count+1);
		            
		         } else {
		       
		             charCount.put(ch,1);
		         }
		      }
		      
		      System.out.println(charCount);
		   }
		

}
