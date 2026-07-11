class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        char[] arr2 = goal.toCharArray();

        for(int k = 0; k<s.length(); k++){
            if(Arrays.equals(arr,arr2)){
                return true;
            }
            else{
                char first = arr[0];
                for(int i=1; i<s.length(); i++){
                    arr[i-1] = arr[i];
                }
            
                arr[arr.length-1] = first;
            }

        }
        return false;
    }
}