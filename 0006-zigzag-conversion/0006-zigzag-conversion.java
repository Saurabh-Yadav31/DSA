class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < s.length(); j += cycle) {
                result.append(s.charAt(j));

                int diagonal = j + cycle - 2 * row;

                if (row != 0 && row != numRows - 1
                        && diagonal < s.length()) {
                    result.append(s.charAt(diagonal));
                }
            }
        }
        return result.toString();
    }
}
/*
Algorithm
1. If numRows == 1 or numRows >= s.length(), return s.
2. Calculate the cycle length as 2 * numRows - 2.
3. Traverse each row from 0 to numRows - 1.
4. For each row, traverse the vertical characters using index j, incrementing by cycle.
5. Append each valid vertical character to result.
6. For middle rows, calculate the diagonal index as j + cycle - 2 * row. If it is valid, append that character too.
7. Return result.toString().

Complexity
- Time Complexity: O(n) each character is appended once.
- Auxiliary Space Complexity: O(1) excluding the output string; the StringBuilder uses O(n) space to store the result.
*/