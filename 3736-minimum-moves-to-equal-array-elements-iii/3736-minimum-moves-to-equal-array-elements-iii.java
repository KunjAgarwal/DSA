class Solution {
    public int minMoves(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        for(int i:nums){
            c+=max-i;
        }
        return c;
    }
}