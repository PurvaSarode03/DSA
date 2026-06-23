class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0)
        return false;
        
        int original=x;
        int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
            }
           return rev==original;
    }
         public static void main(String [] args){
            System.out.println(isPalindrome(121));
         }   
        
    }
