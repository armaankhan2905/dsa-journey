class Solution {
    public int maximumWealth(int[][] accounts) {
        int arr[] = new int[accounts.length];
        int count=0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            arr[count] = sum;
            count++;

        }
        int maximum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}