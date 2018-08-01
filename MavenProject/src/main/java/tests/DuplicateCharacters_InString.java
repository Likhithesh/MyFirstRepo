package tests;

public class DuplicateCharacters_InString {
	static final int MAX_CNT=256; // Create an array of size 256 i.e. ASCII_SIZE
	static final int MAX_CNT2=52; // 26 memory is for small case letters and remaining 26 is for capital letters
	// In first method we are using array of size 256 , so that we can store any characters (like ; , / : etc) 
	// repetation 
	static public void printDuplicateCharacters_M1(String s){
		
		int count[]=new int[MAX_CNT];
		
		int l=s.length();
		
		// Initialize count array index
		for(int i=0;i<l;i++)
			count[s.charAt(i)]++;
		
		// Fetch the value of each characters index from count array and compare , if not zero then print
		// Ex : if s=abc, count[s.charAt(0)] --> count[97] (ASCII value of 'a' = 97) --> it will fetch int value 
		// from 97th index of count array
		for(int j=0;j<l;j++){
			
			if(count[s.charAt(j)]!=0){
				System.out.println(" Number of occurence of \'"+s.charAt(j)+"\' is : "+count[s.charAt(j)]);
			}
			
			count[s.charAt(j)]=0;
		}
		
	}
	
	// In first method we are using array of size 26 , so that we can store only alphabet characters (like a b c d not ; , / : etc) 
	// repetation
	public static void printDuplicateCharacters_M2(String s){
		
		int count1[]=new int[MAX_CNT2];
		
		int l1=s.length();
		
		for(int i=0;i<l1;i++){
			if('a'<=s.charAt(i)&& s.charAt(i)<='z'){
				count1[s.charAt(i)-'a']++;
			}
			
			if('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
				count1[(s.charAt(i)-'A')+26]++;
			}
		}
		
		for(int j=0;j<l1;j++){
			
			if('a'<=s.charAt(j)&& s.charAt(j)<='z' && count1[s.charAt(j)-'a']!=0){
				System.out.println(" Number of occurence of \'"+s.charAt(j)+"\' is : "+count1[s.charAt(j)-'a']);
				count1[s.charAt(j)-'a']=0;
			}
			
			else if('A'<=s.charAt(j) && s.charAt(j)<='Z' && count1[s.charAt(j)-'A'+26]!=0){
				System.out.println(" Number of occurence of \'"+s.charAt(j)+"\' is : "+count1[s.charAt(j)-'A'+26]);
				count1[s.charAt(j)-'A'+26]=0;
			}
			
//			if(count1[s.charAt(j)-'a']!=0){
//				System.out.println(" Number of occurence of \'"+s.charAt(j)+"\' is : "+count1[s.charAt(j)]);
//			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		String s="abhaabAABB";
		printDuplicateCharacters_M1(s);
		System.out.println("***********************************************************************");
		printDuplicateCharacters_M2(s);
	}

}
