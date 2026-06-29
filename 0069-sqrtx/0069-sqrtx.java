class Solution {
	public int mySqrt(int x) {
		
		for (long i = 1; i <= x; i++) {
			long sqrt = i * i;
			if (sqrt == x) {
				return (int) i;
			}
            if(sqrt>x) {
            	return (int) i-1;
            }
		}
		return 0;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.mySqrt(8));
	}
}