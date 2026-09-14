class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();
        for(int i:nums){
            if(seen.contains(i)){
                unique.remove(i);
            }else{
                seen.add(i);
                unique.add(i);
            }
        }
        int sum=0;
        for(int i:unique){
            sum+=i;
        }
        return sum;
    }    
}