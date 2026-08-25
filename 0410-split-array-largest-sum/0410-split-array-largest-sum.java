class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }

        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canReach(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean canReach(int[] arr,int k,int mid){
        int count=1;
        int sum=0;

        for(int num:arr){
            if(sum+num<=mid){
                sum+=num;
            }
            else{
                count++;
                sum=num;
            }
        }
        return count<=k;
    }
}