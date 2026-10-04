class Solution {
    public int longestValidParentheses(String s) {
        int  right=0,left=0,max=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }else right++;

            if(left==right){
                max=Math.max(max,left*2);
            }else if(right>left){
                left=right=0;
            }
        }

        left=right=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(') left++;
            else right++;

            if(left==right){
                max=Math.max(max,left*2);
                }
                else if(left>right){
                    right=left=0;
                }
        }

        return max;
    }
}