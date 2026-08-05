class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    int flag = 0;
                    for(int k=0; k<mat[0].length; k++){
                        if(k!=j && mat[i][k]!=0){
                            flag = 1;
                            break;
                        }
                    }
                    for(int k=0; k<mat.length; k++){
                        if(i!=k && mat[k][j]!=0){
                            flag=1;
                            break;
                        }

                    }
                    if(flag==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}