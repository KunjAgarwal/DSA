class Solution {
    public int minMoves(int[] nums) {
        int n= nums.length;
        int c=0;
        int m=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<m){
                m=i;
            }
        }
        for(int i:nums){
            c+=i-m;
        }
        return c;
    }
}