class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int positiveproduct = nums[n-1]*nums[n-2]*nums[n-3];
        int negativeproduct =nums[0]*nums[1]*nums[n-1];
        int maxproduct;
        if(positiveproduct>negativeproduct){
            maxproduct=positiveproduct;
        }else{
            maxproduct=negativeproduct;
        }
        return maxproduct;
    }
}