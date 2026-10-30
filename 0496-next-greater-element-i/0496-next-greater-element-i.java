class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums2){
            while(!stk.isEmpty() && i>stk.peek()){
                int smaller=stk.pop();
                map.put(smaller,i);
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=map.get(nums1[i]);
        }
        return arr;
    }
}