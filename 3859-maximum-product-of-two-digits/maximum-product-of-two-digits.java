class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int max=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int first=s.charAt(i)-'0';
                int second=s.charAt(j)-'0';
                max=Math.max(max, first*second);
            }
        }
        return max;
    }
}