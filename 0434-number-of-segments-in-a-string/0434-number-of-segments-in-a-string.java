class Solution {
    public int countSegments(String s) {
        s=s.trim();
        int flag = 0;
        int count=0;
        if(s.length() == 0){
            return 0;
        }

        else{
            for(int i=0; i<s.length(); i++){
                
                if(s.charAt(i)==' ' && flag==0){
                    count++;
                    flag = 1;
                }
                else{
                    if(s.charAt(i) != ' ' && flag == 1){
                        flag = 0;
                    }
                }
            }
            count++;
        }
        return count;
    }
}