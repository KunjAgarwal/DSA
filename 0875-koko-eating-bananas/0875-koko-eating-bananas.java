class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=1000000000;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canEatInTime(piles,mid,h)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        long hrs=0;
        for(int pile:piles){
            hrs+=pile/k;
            if(pile%k!=0) hrs++;
        }
        return hrs<=h;
    }
}