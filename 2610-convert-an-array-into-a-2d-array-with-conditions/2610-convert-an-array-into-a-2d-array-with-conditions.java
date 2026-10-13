class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int[] arr=new int[n+1];
        for(int i:nums){
            int row=arr[i];
            if(row==result.size()){
                result.add(new ArrayList<>());
            }
            result.get(row).add(i);
            arr[i]++;
        }
        return result;
    }
}