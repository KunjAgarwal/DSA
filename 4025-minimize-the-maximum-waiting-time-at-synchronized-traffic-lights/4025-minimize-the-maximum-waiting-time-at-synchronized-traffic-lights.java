class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0;
        for(int i:lights){
            max=Math.max(max,i);
        }
        int ans=0;
        for(int time:arrivalTime){
            int r=time%period;
            if(r<max){
                continue;
            }
            int wait=period-r;
            ans=Math.max(ans,wait);
        }
        return ans;
    }
}