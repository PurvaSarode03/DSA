class Solution {
    public int singleNumber(int[] nums) {
    	int ans=0;
    	for(int i=0;i<nums.length;i++) {
    		ans^= nums[i];
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
		int [] arr= {4,1,2,1,2};
		Solution  solution= new Solution();
		System.out.println(solution.singleNumber(arr));
		
	}
}
   