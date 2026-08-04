class Solution {
public static int countSubstrings(String s) {
	int count=0;
	int n=s.length();
	
	for(int i=0;i<n;i++) {
		count+=ispalindrome(s, i, i); //for odd length substring
		count+=ispalindrome(s, i, i+1); //for even lenth substring
		
	}
return count;
}

private static int  ispalindrome(String s ,int left,int right) {
	int count=0;
 
		while(left>=0 && right<s.length() 
        && s.charAt(right)==s.charAt(left)) {
		count++;
		left--;   //expanding phase
		right++;
	}
	
	return count;
	
}
}