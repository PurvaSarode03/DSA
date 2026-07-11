class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount=0;
        int maxcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentcount++;
                
            }
            else{
                maxcount=Math.max(maxcount,currentcount);
                currentcount=0;
            }
            
        }
       return Math.max(maxcount ,currentcount);//we check again to count the  current  last consecutive ones bcoz in last if 0 is not found then our else logic will not run and it give wrong input
    }
}