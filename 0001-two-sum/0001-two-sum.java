class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			return new int [] {i,j}; 
        			}
        }
        
    }
        return new int[] {};
	}
	
	
	public static void main(String[] args) {
		
		int [] nums= {1,2,3,4,5};
		int target=15;
		Solution  solution= new Solution();
		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
		
		
		
	}
        
    }
