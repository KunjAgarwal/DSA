class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            int p=0;
            for(int j=0;j<m;j++) {
                if(grid[i][j]=='.'){
                    char temp=grid[i][j];
                    grid[i][j]=grid[i][p];
                    grid[i][p]=temp;
                    p++;
                }else if(grid[i][j]=='*')
                    p = j+1;
            }
        }
        char[][] res=new char[m][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                res[j][n-1-i]=grid[i][j];

        return res;
    }
}