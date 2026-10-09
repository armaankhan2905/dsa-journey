class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;
        int index = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                index = i;
                max = nums[i];
            }
        } 
        for(int i=0; i<nums.length; i++){
            if(i == index){
                continue;
            }

            if(nums[i]>secondMax ){
                secondMax = nums[i];
            }
        }
        return (max-1)*(secondMax-1);
    }
}