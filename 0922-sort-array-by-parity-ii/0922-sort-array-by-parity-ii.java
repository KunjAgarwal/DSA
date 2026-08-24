class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int e=0;
        int o=1;
        for(int i:nums){
            if(i%2==0){
                arr[e]=i;
                e+=2;
            }else{
                arr[o]=i;
                o+=2;
            }
        }
        return arr;
    }
}