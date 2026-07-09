class Solution {
   public static int[] shuffle(int[] nums, int n) {
		
	        int k=0;
	        int [] arr= new int[nums.length];
	        for(int i=0;i<n;i++) {
	        	arr[k]=nums[i];
	        	k++;
	        	arr[k]=nums[n+i];
	        	k++;
	        	
	        }
	     return arr;   
	    }
}