class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int v=0;
        int co=0;
        for(int i=0;i<26;i++){
            char c=(char)(i+'a');
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') v=Math.max(v,freq[i]);
            else co=Math.max(co,freq[i]);
        }
        return v+co;
    }
}