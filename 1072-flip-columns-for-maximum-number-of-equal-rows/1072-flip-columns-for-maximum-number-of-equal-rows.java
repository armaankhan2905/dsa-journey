class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patternCounts = new HashMap<>();
        int maxRows = 0;

        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();

            int firstToken = row[0];
            
            for (int bit : row) {

                if (bit == firstToken) {
                    pattern.append('0');
                } else {
                    pattern.append('1');
                }
            }
            
            String key = pattern.toString();
            patternCounts.put(key, patternCounts.getOrDefault(key, 0) + 1);
            maxRows = Math.max(maxRows, patternCounts.get(key));
        }

        return maxRows;
    }
}
