class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0, count=0, copy=x;
        while(x>0) {
            int rem;
            rem = x%10;
            
            x=x/10;
            reverse = reverse*10 + rem;
            count++;
        }
        
        if(reverse==copy){
            return true;
        }
        return false;
    }
}