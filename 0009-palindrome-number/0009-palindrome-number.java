class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(temp<0) return false;
        int pal=0;
        while(temp!=0){
            int dig=temp%10;
            pal=pal*10+dig;
            temp/=10;
        }
        return pal==x;
    }
}