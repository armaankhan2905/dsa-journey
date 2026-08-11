class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String s2 = "";
        int start = 0;
        int end = s.length();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                if(i+1==end){
                    end=i;
                    continue;
                }else{
                    start = i+1;
                }
                for(int j=start; j<end; j++){
                    s2+=s.charAt(j);
                }
                s2+=' ';
                end = i;
            }
        }
        for(int j=0; j<end;j++){
            s2+=s.charAt(j);
        }
        return s2;
    }
}