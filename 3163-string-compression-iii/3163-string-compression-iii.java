class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char current = word.charAt(i);
            int count = 0;
            while (i < word.length()
                    && word.charAt(i) == current
                    && count < 9) {
                count++;
                i++;
            }
            result.append(count);
            result.append(current);
        }
        return result.toString();
    }
}