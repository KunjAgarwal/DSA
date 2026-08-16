class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<n;i++){
            int c=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(c<=drones[i][2]){
                if(c<min){
                    min=c;
                    ans=i;
                }
            }
        }
        return ans;
    }
}