class Solution {
    public int compress(char[] chars) {
        String s="";
        int i=0;
        if(chars.length==1){
            return 1;
        }
        while(i<chars.length){
            // char ch = chars[i];
            int count = 1;
            int j = i+1;
            while(j<chars.length && chars[i] == chars[j]){
                count++;
                j++;
            }
            s+=chars[i];
            if(count>1){
                s+=String.valueOf(count);
            }
            
            i=j;

            for(int k=0; k<s.length(); k++){
                chars[k] = s.charAt(k);
            }
        }
        return s.length();
    }
}