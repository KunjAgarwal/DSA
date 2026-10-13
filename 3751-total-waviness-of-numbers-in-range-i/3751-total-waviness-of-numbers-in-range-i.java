class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++){
            c+=calculateWaviness(i);
        }
        return c;
    }
    private int calculateWaviness(int n) {
        if(n<100) return 0;
        char[] digits = String.valueOf(n).toCharArray();
        int c=0;
        for(int j=1;j<digits.length-1;j++){
            char prev=digits[j-1];
            char curr=digits[j];
            char next=digits[j+1];
            if((curr>prev && curr>next) || (curr<prev && curr<next)) c++;
        }
        return c;
    }
}