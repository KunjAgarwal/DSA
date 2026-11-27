class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE;
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    count++;
                }
            }
            value[i] = count;
        }
        int[] dp = new int[budget + 1];
        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int val = value[i];
            for (int c = budget; c >= price; c--) {
                dp[c] = Math.max(dp[c], dp[c - price] + val);
            }
        }
        int maxTotal = 0;
        for (int c = 0; c <= budget; c++) {
            int extraCopies = (budget - c) / minPrice;
            maxTotal = Math.max(maxTotal, dp[c] + extraCopies);
        }
        return maxTotal;
    }
}