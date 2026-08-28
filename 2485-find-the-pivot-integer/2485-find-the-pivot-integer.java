class Solution {
    public int pivotInteger(int n) {
        int left=1;
        int right=n;
        int Sum=(n*(n+1))/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            int Sum1=(mid*(mid+1))/2;
            int Sum2=Sum-Sum1+mid;
            if(Sum1==Sum2)
                return mid;
            else if(Sum1<Sum2)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}