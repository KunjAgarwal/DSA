class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        for(int i:nums1){
            n1.add(i);
        }
        HashSet<Integer> n2=new HashSet<>();
        for(int i:nums2){
            if(n1.contains(i)){
                n2.add(i);
            }
        }
        int[] ans = new int[n2.size()];
        int k=0;
        for(int i:n2){
            ans[k]=i;
            k++;
        }
        return ans;
    }
}