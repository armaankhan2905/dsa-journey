class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        int size2 = strs[0].length();
        String str = "";


        int count=strs[0].length();
        for(int i=0; i<size; i++){
            int count2 = strs[i].length();
            
            if(count2<count){
                count = count2;
            }
        }
        for(int i=0; i<count; i++){
            for(int j=0; j<size; j++){
                
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return str;
                }
                
                
            }
            str+=strs[0].charAt(i);
        }
        return str;
    }
}