class Solution {
    public boolean checkDivisibility(int n) {
        int temp1=n;
        int sum =0;
        int pro=1;
        while(n!=0){
            int temp = n%10;
            sum=sum+temp;
            pro=pro*temp;
            n=n/10;
        }
        int total = sum+pro;
        if((temp1%total)==0){
            return true;
        }
        return false;
    }
}