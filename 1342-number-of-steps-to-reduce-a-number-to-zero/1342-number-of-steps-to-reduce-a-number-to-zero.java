class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
            }else{
                if(num==3 || num%4!=0){
                    num--;
                }
            }
            c++;
        }
        return c;
    }
}