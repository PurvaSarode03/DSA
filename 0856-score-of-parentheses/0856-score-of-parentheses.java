class Solution {
    public int scoreOfParentheses(String s) {
       int count=0,score=0;
       int len=s.length();

        for(int i=0;i<s.length();i++){

            if(len==0)
                break;
            

            if(s.charAt(i)=='(') count++;
            else {
                count--;
                if(s.charAt(i-1)=='('){
               score+=1<<count;
            }
            } 
    }
        return score;
    }
}