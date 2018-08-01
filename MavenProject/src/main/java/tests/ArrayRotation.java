package tests;

import java.util.Arrays;

public class ArrayRotation {
	
	public static void rotate(int[] nums, int k) {
	    if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        //result[i] = nums[nums.length-k+i];
	        result[nums.length-k+i] = nums[i];
	        System.out.println(Arrays.toString(result));
	    }
	 
	    int j=0;
	   // for(int i=k; i<nums.length; i++)
	    	for(int i=k; i<nums.length; i++)
	    {
//	        result[i] = nums[j];  // To Rotate an array of n elements to the right by k steps.
	    		result[j] = nums[i]; // To Rotate an array of n elements to the left by k steps.
	        j++;
	        Arrays.toString(result);
	    }
	 
	    //System.arraycopy( result, 0, nums, 0, nums.length );
	    
	    System.out.println(Arrays.toString(result));
	    System.out.println(Arrays.toString(nums));
	    
	}

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6,7};
		
		rotate(a,2);
		
		

	}

}
