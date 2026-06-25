class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    
    public static void main(String[] args) {
		Solution  solution=new Solution();
		int [] arr= {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		System.out.println("after increment");
		System.out.println(Arrays.toString(solution.plusOne(arr)));
	}
}