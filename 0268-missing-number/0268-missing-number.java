class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        
        for(int i=0; i<=size; i++){
            boolean found = false;
            for(int j = 0; j<size; j++) {
                if(nums[j] == i){
                    found = true;
                    break;

                }

                
            }
            if(!found){
                return i;
            }
            
        }
        return -1;
    }
}