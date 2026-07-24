class Solution {
    public static int maxSubArray(int[] nums) {
int maxSum=nums[0];
int cursum=0;

for(int  num:nums) {
	cursum+=num;
	maxSum=Math.max(maxSum, cursum);
	
	if(cursum<0)
		cursum=0;
}
        
      return maxSum;  
    }
}