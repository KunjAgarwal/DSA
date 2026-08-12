class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int left=0;
        while(left+1<n && arr[left]<arr[left+1]){
            left++;
        }
        if(left==0 || left==n-1){
            return false;
        }
        while(left+1<n && arr[left]>arr[left+1]){
            left++;
        }
        return left==n-1;
    }
}