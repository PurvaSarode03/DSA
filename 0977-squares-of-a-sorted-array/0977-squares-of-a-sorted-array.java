class Solution {
	
	public int[] sortedSquares(int []nums) {
		for(int i=0;i<nums.length;i++) {
		  nums[i]=nums[i] * nums[i];
		}
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			
		}
	
		return nums;
	}
	
    public static void main(String[] args) {
    	int [] arr= {-2,7,3,8};
		Solution  solution= new Solution();
		System.out.println(Arrays.toString(solution.sortedSquares(arr)));
	}
}