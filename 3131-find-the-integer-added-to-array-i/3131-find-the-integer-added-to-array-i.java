class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m1=1001,m2=1001;
        for(int i=0;i<n;i++){
            m1=Math.min(m1,nums1[i]);
            m2=Math.min(m2,nums2[i]);
        }
        return m2-m1;
    }
}