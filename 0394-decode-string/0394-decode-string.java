class Solution {
    public String decodeString(String s) {
        Stack<Character> st= new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch!=']'){
            st.push(ch);
        }

        else{
            StringBuilder str=new StringBuilder();
            while(st.peek()!='[' ){
                str.insert(0,st.pop());  //creates a string inside brackets
            }
            st.pop();  //remove openinng bracket

            StringBuilder num= new StringBuilder();
            while(!st.isEmpty() &&  Character.isDigit(st.peek())){
                num.insert(0,st.pop()); //build the number 
            }
          int repeat=Integer.parseInt(num.toString());
          //convert StringBuilder into int bcoz we'll use it in loop

            StringBuilder repeated= new StringBuilder();
            for(int i=0;i<repeat;i++){
                repeated.append(str);  //multiply num with str
            }

            for(char c:repeated.toString().toCharArray()){
                st.push(c);     //push back into the array 
            }
        }
    }
          StringBuilder result = new StringBuilder();
            while(!st.isEmpty()){
                result.insert(0,st.pop());
            }
     return result.toString();
    }
}