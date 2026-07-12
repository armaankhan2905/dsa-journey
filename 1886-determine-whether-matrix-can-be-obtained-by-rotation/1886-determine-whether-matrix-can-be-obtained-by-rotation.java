class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] matrix2 = new int[mat.length][mat.length];
        int[][] matrix3 = new int[mat.length][mat.length];

        for(int k=0;k<4;k++){
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat.length; j++){
                    matrix2[i][j] = mat[j][i];
                }
            }
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat.length; j++){
                    matrix3[i][j] = matrix2[i][mat.length-1-j];
                }
            }

            boolean same = true;
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat.length; j++){
                    if(matrix3[i][j] == target[i][j]){
                        continue;
                    }
                    else{
                        same = false;
                        break;
                    }
                }
                if(!same)break;
            }
            if(same)return true;
            mat = matrix3;
            matrix3 = new int[mat.length][mat.length];
        }
        return false;
    }
}