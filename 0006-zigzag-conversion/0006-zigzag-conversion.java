class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int row = 0; row < numRows; row++) {
            int index = row;
            boolean goingDown = true;

            while (index < n) {
                result.append(s.charAt(index));
                if (row == 0 || row == numRows - 1) {
                    index += 2 * (numRows - 1);
                } else {
                    int step;
                    if (goingDown) {
                        step = 2 * (numRows - 1 - row);
                    } else {
                        step = 2 * row;
                    }

                    index += step;
                    goingDown = !goingDown;
                }
            }
        }
        return result.toString();
    }
}