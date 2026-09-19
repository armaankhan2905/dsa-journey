class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < grid.length; i++) {
                ans[j] = Math.max(ans[j], String.valueOf(grid[i][j]).length());
            }
        }

        return ans;
    }
}