class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int ans=0;
        int c=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0){ 
                break;
            }
                int p= (c/8)+1;
                ans+=freq[i]*p;
                c++;
        }
        return ans;
    }
}