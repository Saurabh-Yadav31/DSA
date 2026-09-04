class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = buildString(s);
        StringBuilder t1 = buildString(t);

        return s1.toString().equals(t1.toString());
    }

    private StringBuilder buildString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb;
    }
}