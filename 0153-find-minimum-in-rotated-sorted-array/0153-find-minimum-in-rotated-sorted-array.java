class Solution {
    public int findMin(int[] nums) {
        int current = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[current]){
                current = i;
            }
        }
        return nums[current];
    }
}