class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(st.isEmpty()){
                    count++;
                }else{
                    char x=st.peek();
                    if(x=='('){
                        st.pop();
                    }else{
                        count++;
                    }
                }
            }
        }
        return count+st.size();
        
    }
}