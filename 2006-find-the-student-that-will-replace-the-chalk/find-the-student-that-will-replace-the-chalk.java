class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        int n=chalk.length;
        for(int i=0;i<n;i++){
            sum+=chalk[i];
        }
        long left=k%sum;
        for(int i=0;i<n;i++){
            if(chalk[i]<=left){
                left-=chalk[i];
            }else{
                return i;
            }
        }
        return 0;
    }
}