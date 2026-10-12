class Solution {
    int index = 0;

    public String decodeString(String s) {
        return solve(s);
    }

    public String solve(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        while (index < s.length()) {
            char c = s.charAt(index++);

            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } 
            else if (c == '[') {
                String decoded = solve(s);

                for (int i = 0; i < count; i++) {
                    result.append(decoded);
                }

                count = 0;
            } 
            else if (c == ']') {
                return result.toString();
            } 
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}