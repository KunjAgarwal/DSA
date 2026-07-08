class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long ten=1;
        while(n!=0){
            long digit = n%10;
            if(digit!=0){
            x=digit*ten+x;
            ten*=10;
            }
            n/=10;
        }
        long ans=x;
        long sum=0;
        while(x!=0){
            long digit=x%10;
            sum+=digit;
            x/=10;
        }
        return ans*sum;
    }
}