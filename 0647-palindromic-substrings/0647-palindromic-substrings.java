class Solution {
public static int countSubstrings(String s) {
	int count=0;
	int left=0;
	while(left<s.length()) {
		
	
	for(int right=left;right<s.length();right++) {
		if(ispalindrome(s, left, right)) {
			count++;
		}
	}
	
     left++;   
	}
return count;

}

private static boolean ispalindrome(String s ,int left,int right) {
	while(left<right) {
		if(s.charAt(right)!=s.charAt(left))
			return false;
		left++;
		right--;
	}
	
	return true;
	
}
}