class Solution {
    public int searchInsert(int[] nums, int target) {
        // int size = nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            
                
            

        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}