class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax=0,curMin=0;
        int globMax=nums[0],globMin=nums[0];
        int total=0;

        for(int n:nums){
            curMax=Math.max(curMax+n,n);
            curMin=Math.min(curMin+n,n);

            globMax=Math.max(globMax,curMax);
            globMin=Math.min(globMin,curMin);

            total+=n;
            }
            if(globMax>0){
                return Math.max(globMax,total-globMin);
            }else
            return globMax;

       
        
    }
}