class Solution {
    public String reverseOnlyLetters(String s) {
        String s2="";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                s2+=s.charAt(i);
            }
        }
        String s3 = "";
        int count = s2.length()-1;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                s3+=s2.charAt(count);
                count--;
            }
            else{
                s3+=s.charAt(i);
            }
        }
        return s3;
    }
}