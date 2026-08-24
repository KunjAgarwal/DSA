class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int m=target.length;
        int n=arr.length;
        if(m!=n) return false;
        boolean flag = false;
        for(int i=0;i<m;i++){
            if(target[i]==arr[i]){
                flag= true;
            }else{
                flag= false;
                break;
            }
        }
        return flag;
    }
}