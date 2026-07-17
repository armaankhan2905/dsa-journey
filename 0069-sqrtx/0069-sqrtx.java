class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }

        int left=1;
        int right=x;

        while(left<=right){
            int mid = left+ (right-left)/2;
            long sq = (long)mid*mid;

            if(sq==x){
                return mid;
            }
            else if(sq<x){
                if((long)(mid+1)*(mid+1)>x){
                    return mid;
                }
                left = mid+1;
               
            }else{
                right=mid-1;
            }
        }

            
    
        return -1;
    }
}