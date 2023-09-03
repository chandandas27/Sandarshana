package com.java.programs.strings;

import java.util.HashMap;

public class Non_Repeating_Unique_Character {
	
	public static void main(String[] args) {

	System.out.println(firstNonRepeatedCharacter("abbeeaababbhhcccddgafgfjjzaabbaazzaabbabzz"));		
		
	}
	
		public static Character firstNonRepeatedCharacter(String str)
		
	    {
			
			Character unique = null;
	
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
   
		  
		     for (int i = str.length()-1; i >=0; i--) {
		      
		   // for (int i=0; i<str.length(); i++) {
		    	  
		            if(charCount.get(str.charAt(i))==1){
		             unique = str.charAt(i);
		                break;
		            }
		        }
		        return unique;

}

}
