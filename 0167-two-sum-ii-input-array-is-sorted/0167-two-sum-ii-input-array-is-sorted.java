class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		int n = numbers.length;
		int left = 0;
		int right = n - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target)
				return new int[] { left+1, right+1 };
			else if (sum > target)
				right--;
			else
				left++;

		}
		return new int [] {};

	}
	
	public static void main(String[] args) {
		int [] num= {1,2,3,4};
		int target =5;
		
		System.out.println(Arrays.toString(twoSum(num, target)));
	}
}
