package tests;

import java.util.ArrayList;
import java.util.List;

public class Panagram {
	
	// If a string contains all the characters from A to Z in it , then we will call that type of string as "PANGRAM"
	// EX : String s="Hi I am panagram but cdefghijklmnopqrstuvwxyz";
	
	public static boolean checkPangram (String str)
    {
		// Create a hash table to mark the 
	    // characters present in the string
	    // By default all the elements of 
	    // mark would be false.
	    boolean[] mark = new boolean[26];
	    
	    // For indexing in mark[]
	    int index = 0;
	
	    // Traverse all characters
	    for (int i = 0; i < str.length(); i++)
	    {
	        // If uppercase character, subtract 'A'
	        // to find index.
	        if ('A' <= str.charAt(i) && 
	                str.charAt(i) <= 'Z')
	                     
	            index = str.charAt(i) - 'A';
	
	            // If lowercase character, subtract 'a'
	            // to find index.
	        else if('a' <= str.charAt(i) && 
	                    str.charAt(i) <= 'z')
	                         
	            index = str.charAt(i) - 'a';
	
	        // Mark current character
	        mark[index] = true;
    }

    // Return false if any character is unmarked
    for (int i = 0; i <= 25; i++)
        if (mark[i] == false)
            return (false);

    // If all characters were present
    return (true);
}

	public static void main(String[] args) {
		
		String s="Hi I am panagram but cdefghijklmnopqrstuvwxyz";
		
		if (checkPangram(s) == true)
            System.out.print(s + " is a pangram.");
        else
            System.out.print(s+ " is not a pangram.");
		
		

	}

}
