class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sum==nums[j]) sum++;
            }
        }
        return sum;
    }
}