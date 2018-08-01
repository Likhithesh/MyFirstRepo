package tests;

import java.util.HashSet;

public class Substring {
	
	public static void Method1(){
		
		String str="abcdabcijk";
		
		int[] charindxs=new int[256];
		
		String longestOverAll="";
		String longestTillNow="";
		
		for(int i=0;i<str.length();i++){
			charindxs[str.charAt(i)]=-1;
		}
		
	}
	
	public static void main(String[] args) 
	{
		String str= "ilovemyindiabcdefgh";
		
	        HashSet<Character> set = new HashSet<Character>();

	        String longestOverAll = "";
	        String longestTillNow = "";

	        for (int i = 0; i < str.length(); i++) 
	        {
	            char c = str.charAt(i);

	            if (set.contains(c))
	            {
	                longestTillNow = "";
	                set.clear();
	            }
	            longestTillNow += c;
	            set.add(c);
	            if (longestTillNow.length() > longestOverAll.length())
	            {
	                longestOverAll = longestTillNow;
	            }
	        }
	        
	        System.out.println(longestOverAll);

	    } 

}
