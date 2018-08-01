package tests;

import java.util.Arrays;

public class ArrayRotation2 {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6,7};
		int temp = 0,j;
		for(int i=0;i<2;i++){
			for(j=0;j<a.length-1;j++){
				
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
		
		System.out.println(Arrays.toString(a));

	}

}
