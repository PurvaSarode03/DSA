class Solution {
 
        public int maxAbsoluteSum(int[] nums) {
     
		 int currmax=0;
		 int maxsum=nums[0];
		 int currmin=0;
		 int minsum=nums[0];
		 
		 for(int n:nums) {
			 currmax=Math.max(currmax+n, n);
			 maxsum=Math.max(maxsum, currmax);
			 
			 currmin=Math.min(currmin+n, n);
			 minsum=Math.min(currmin, minsum);
			 }
		 return Math.max(maxsum, Math.abs(minsum));
	
	}
}