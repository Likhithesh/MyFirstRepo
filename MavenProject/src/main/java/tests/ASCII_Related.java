package tests;

public class ASCII_Related {

	public static void main(String[] args) {
		
		String s="aAbB";
		
		for(int j=0;j<s.length();j++){
			int i=s.charAt(j);
			
			System.out.println("ASCII Value of \'"+s.charAt(j)+"\' is : "+i);
		}
		
		for(int j=0;j<256;j++){
			
			char c=(char) j;
			System.out.print(" "+c+" ");
			if((j%10)==9){
				System.out.println("");
			}
		}
	}

}
