class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negative = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int value = matrix[i][j];

                if (value < 0) {
                    negative++;
                }

                int abs = Math.abs(value);
                sum += abs;

                minAbs = Math.min(minAbs, abs);
            }
        }

        if (negative % 2 == 1) {
            sum -= 2L * minAbs;
        }

        return sum;
    }
}