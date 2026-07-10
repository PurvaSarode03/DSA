class Solution {
    public static long maximumSubarraySum(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		long windowSum = 0;
		long maxsum = 0;

		for (int i = 0; i < nums.length; i++) {
			windowSum += nums[i];
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

			if (i >= k) {
				windowSum -= nums[i - k];

				map.put(nums[i - k], map.get(nums[i - k]) - 1);
				if (map.get(nums[i - k]) == 0) {

					map.remove(nums[i - k]);
				}

			}
			if (i >= k - 1 && map.size() == k) {
				maxsum = Math.max(maxsum, windowSum);

			}

		}
		return maxsum;

	}
}