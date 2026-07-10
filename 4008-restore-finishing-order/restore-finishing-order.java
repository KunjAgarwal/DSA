class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int m = order.length;
        int n = friends.length;
        int k=0;
        int[] arr = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(order[i]==friends[j]){
                    arr[k]=friends[j];
                    k++;
                }
            }
        }
        return arr;
    }
}