class Solution {
    public void rotate(int[][] matrix) {
        
        int[][] matrix2 = new int[matrix.length][matrix.length];
        int[][] matrix3 = new int[matrix.length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix2[i][j] = matrix[j][i];
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix3[i][j] = matrix2[i][matrix.length-1-j];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = matrix3[i][j];
            }
        }
        return;
    }
}