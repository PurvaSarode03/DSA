
class Solution {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] merge = new int[nums1.length + nums2.length];
		int n = merge.length;

		for (int i = 0; i < nums1.length; i++) {
			merge[i] = nums1[i];

		}

		for (int j = 0; j < nums2.length; j++) {
			merge[nums1.length + j] = nums2[j];
		}

		Arrays.sort(merge);
		System.out.println(Arrays.toString(merge));
		if (n % 2 == 0) {

			double res1 = (merge[n / 2] + merge[n / 2 - 1]) / 2.0;
			return res1;
		}
		else {
			double res2=merge[n/2];
		return res2;
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 6, 3, 4 };
		int[] arr2 = { 2, 6, 7, 8 };
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}
}
