class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        
        for (int num : piles) {
    high = Math.max(high, num);
        }                              

        int ans=high;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(canEat(piles,h,mid)){
                ans=mid;
                high=mid-1;//bcoz we want min speed
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

        private boolean canEat(int[] pile,int h,int k){
            long hours=0;
            for(int piles:pile){
                hours+=(piles+k-1)/k;
            }
              return hours<=h;
        }
        
    
}