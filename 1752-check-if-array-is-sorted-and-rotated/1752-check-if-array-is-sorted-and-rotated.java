class Solution {
    public boolean check(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            int first = nums[0];
            int current =0;
            for(int j=1; j<nums.length; j++){
                if(nums[current]<=nums[j]){
                    current++;
                }
                else{
                    break;
                }
            }
            if(current==nums.length-1){
                return true;
            }
            else{
                for(int k=1; k<nums.length; k++){
                    nums[k-1] = nums[k];
                }
                nums[nums.length-1] = first;
            }
            
        }
        return false;
    }
}