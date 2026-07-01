class Solution {
	public void moveZeroes(int[] nums) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[k] = nums[i];
				k++;
			}
		}
		while (k < nums.length) {
			nums[k] = 0;
			k++;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 0, 3 };
		Solution solution = new Solution();
		solution.moveZeroes(arr);
		System.out.println((Arrays.toString(arr)));
	}
}