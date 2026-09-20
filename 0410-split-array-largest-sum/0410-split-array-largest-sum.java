class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            l=Math.max(l,nums[i]);
            r+=nums[i];
        }
        while(l<r){
            int mid=l+(r-l)/2;
            int parts=1;
            int sum=0;
            for(int i=0;i<n;i++){
                if(sum+nums[i]>mid){
                    parts++;
                    sum=nums[i];
                }else{
                    sum+=nums[i];
                }
            }
            if(parts<=k){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}