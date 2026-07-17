class Solution {
    public int findMin(int[] nums) {
        // int current = 0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]<nums[current]){
        //         current = i;
        //     }
        // }
        // return nums[current];

        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+ (right-left)/2;
            if(nums[right]<nums[mid]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}