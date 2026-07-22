class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n=nums.length;
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }

        for(int i=0;i<=n;i++){
            if(freq[i]==2){
                ls.add(i);
            }
        }
        return ls;
    }
}