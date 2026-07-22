class Solution {
    public String reverseVowels(String s) {
        int vowelsIndex[] = new int[s.length()];
        int count =0;
        String s2 = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                vowelsIndex[count] = i;
                count++;
            }
        }
        count = count-1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                s2 += s.charAt(vowelsIndex[count]);
                count--;
            }
            else{
                s2+=s.charAt(i);
            }
        }
        return s2;
    }
}