class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
        
    }

    private String build(String str){
        Stack<Character> st= new Stack<Character>();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }

        StringBuilder res= new   StringBuilder ();
        for(char c:st){
            res.append(c);
        }
        return res.toString();

    }
}