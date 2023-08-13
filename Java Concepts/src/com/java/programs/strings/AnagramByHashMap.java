package com.java.programs.strings;

import java.util.HashMap;

public class AnagramByHashMap {
	
	public static boolean isAnagram(String a, String b) {
		
        HashMap<Character,Integer> map = new HashMap<>();
        
        int a1=a.length();
        int b1=b.length();
        
        if(a1!=b1){
        	
        	return false;
        	
        	}
        
        for(int i=0;i<a1;i++){
        	
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)-1);
        }
        
        for(char c : map.keySet()){
        	
            if(map.get(c)!=0){
            	
            	return false;
            }
        }
        
        return true;
    }

      public static void main(String[] args) {
    	  
    	  System.out.println(isAnagram("listen","silent"));
	
      }

}
