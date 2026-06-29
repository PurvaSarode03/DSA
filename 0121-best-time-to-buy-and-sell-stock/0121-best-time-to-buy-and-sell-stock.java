class Solution {

	public int maxProfit(int[] prices) {
		int min = prices[0];
		int max = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
			int profit = prices[i] - min;
			if (profit > max) {
				max = profit;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		Solution solution = new Solution();
		System.out.println(solution.maxProfit(arr));

	}
}