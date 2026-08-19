class Solution {
    public int minimumChairs(String s) {

        int current = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'E') {
                current++;
                max = Math.max(max, current);
            } else {
                current--;
            }
        }

        return max;
    }
}