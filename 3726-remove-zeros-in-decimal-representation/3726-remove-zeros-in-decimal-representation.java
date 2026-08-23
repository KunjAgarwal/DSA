class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='0'){
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return Long.parseLong(ans.toString());
    }
}