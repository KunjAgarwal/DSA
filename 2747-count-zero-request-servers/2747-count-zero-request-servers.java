class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);
        int[][] q = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q, (a, b) -> a[0] - b[0]);
        int[] freq = new int[n + 1];
        int[] ans = new int[queries.length];
        int left = 0;
        int right = 0;
        int activeServers = 0;
        for (int i = 0; i < q.length; i++) {
            int time = q[i][0];
            int index = q[i][1];
            int start = time - x;
            while (right < logs.length && logs[right][1] <= time) {
                int server = logs[right][0];
                if (freq[server] == 0) {
                    activeServers++;
                }
                freq[server]++;
                right++;
            }
            while (left < right && logs[left][1] < start) {
                int server = logs[left][0];
                freq[server]--;
                if (freq[server] == 0) {
                    activeServers--;
                }
                left++;
            }
            ans[index] = n - activeServers;
        }
        return ans;
    }
}