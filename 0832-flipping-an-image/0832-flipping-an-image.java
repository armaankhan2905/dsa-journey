class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] reversed = new int[image.length][image.length];
        int[][] flipped = new int[image.length][image.length];

        for(int i=0; i<image.length; i++){
            int[] rev = new int[image.length];
            for(int j=0; j<image.length; j++){
                rev[j] = image[i][image.length-1-j];
            }
            reversed[i] = rev;
        }

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                flipped[i][j] = 1-reversed[i][j];
            }
        }
        return flipped;
    }
}