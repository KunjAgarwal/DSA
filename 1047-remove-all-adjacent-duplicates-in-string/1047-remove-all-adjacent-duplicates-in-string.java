class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       for(char ch:s.toCharArray()){
        if(st.empty() || st.peek()!=ch){
            st.push(ch);
        }else{
            st.pop();
        }
       }
       StringBuilder sb = new StringBuilder();
       while(!st.empty()){
        sb.append(st.pop());
       }
       return sb.reverse().toString();
    }
}