class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            int temp1=n%10;
            sum=sum+temp1;
            pro=pro*temp1;
            n=n/10;
        }
        int total=sum+pro;
        if((temp%total)==0){
            return true;
        }
        return false;
    }
}