class Solution {
     	 public static void reverseString(char[] s) {
	        int left=0;
	        int right=s.length-1;
	        
	        while(right>left) {
	        	char temp=s[left];
	        	s[left]=s[right];
	        	s[right]=temp;
	        	left++;
	        	right--;
	        	
	        }
	        System.out.println(Arrays.toString(s));
	        
	    }
	 
}