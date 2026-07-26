
 class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       
            int temp=nums[n-1]*nums[n-2]*nums[n-3];
            int temp1=nums[0]*nums[1]*nums[n-1];
            return Math.max(temp1,temp);

   
    }
}
