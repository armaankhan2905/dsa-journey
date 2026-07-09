class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int result = -1;
        for(int i=0; i<size; i++){
            if(nums[i] == target){
                result = i;
            }
        }
        return result;
    }
}