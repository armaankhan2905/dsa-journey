class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        int[][] arr2 = new int[0][0];
        int count = 0;
        int size = original.length;

        if(size != m*n ){
            return arr2;
        }
        else{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = original[count];
                    count++;
                }
            }
        }

        return arr;
    }
}