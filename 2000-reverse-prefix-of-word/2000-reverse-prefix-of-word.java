class Solution {
    public String reversePrefix(String word, char ch) {

        int end = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                end = i;
                break;
            }
        }

        if (end == -1) {
            return word;
        }

        StringBuilder s = new StringBuilder();
        

        for (int j = 0; j <= end; j++) {
            s.append(word.charAt(j));
        }

        s.reverse();

        StringBuilder sb = new StringBuilder(s);

        for (int j = end + 1; j < word.length(); j++) {
            sb.append(word.charAt(j));
        }

        return sb.toString();
    }
}