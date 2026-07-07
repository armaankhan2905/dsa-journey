class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length();
        int i = size-1;
        int count=0;
        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while(i>=0 && s.charAt(i) != ' '){
                
            count++;
            i--;
        }
                    
                
                
                      
        
        return count;
    }
}