class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i:arr){
            if(i>max){
                max=i;
                idx++;
            }
        }
        return idx-1;
    }
}