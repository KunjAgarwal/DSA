class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);        
        int k=n/3;
        int total=0;
        int idx=n-2;
        for(int i=0;i<k;i++){
            total+=piles[idx];
            idx-=2;
        }
        return total;
    }
}