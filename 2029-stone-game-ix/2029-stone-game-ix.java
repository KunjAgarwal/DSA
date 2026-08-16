class Solution {
    public boolean stoneGameIX(int[] stones) {
        int n = stones.length;
        int[] freq = new int[3];
        for(int i:stones){
            freq[i%3]++;
        }
        int a=freq[0];
        int b=freq[1];
        int c=freq[2];
        if(a%2==0) return b>0 && c>0;
        return Math.abs(b-c)>2;
    }
}