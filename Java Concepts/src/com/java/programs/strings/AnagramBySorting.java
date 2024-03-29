package com.java.programs.strings;

import java.util.Arrays;

public class AnagramBySorting {

	static boolean isAnagramSort(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    char[] a1 = string1.toCharArray();
	    char[] a2 = string2.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(isAnagramSort("listen","silent"));
		System.out.println(isAnagramSort("chandan","ndacanh"));
		
	}

}
