class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length>=3) return nums[1];
        // return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=max){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}