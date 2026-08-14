class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int j=0;
        while(i<n){
            int c=0;
            char curr=chars[i];
            while(i<n && chars[i]==curr){
                i++;
                c++;
            }
            chars[j++]=curr;
            if(c>1){
                String s=String.valueOf(c);
                for(char ch:s.toCharArray()){
                    chars[j++]=ch;
                }
            }
        }
        return j;
    }
}