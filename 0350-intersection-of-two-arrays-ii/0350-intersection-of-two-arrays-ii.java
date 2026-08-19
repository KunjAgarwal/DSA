class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ls= new ArrayList<>();
        for(int i:nums1){
            for(int j=0;j<nums2.length;j++){
                if(i==nums2[j]){
                    ls.add(i);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}