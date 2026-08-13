class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        for(int i=min+1;i<max;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    flag=true;
                    break;
                }
            }
            if(!flag){ls.add(i);}
        }
        return ls;
    }
}