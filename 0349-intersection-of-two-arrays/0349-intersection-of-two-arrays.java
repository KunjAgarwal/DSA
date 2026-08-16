class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> ls= new ArrayList<>();
        HashSet<Integer> n1=new HashSet<>();
        for(int i:nums1){
            n1.add(i);
        }
        HashSet<Integer> n2=new HashSet<>();
        for(int i:nums2){
            n2.add(i);
        }
        for(int i:n1){
            for(int j:n2){
                if(i==j){
                    ls.add(i);
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