class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
/*
1. Store Roman numeral values and their corresponding symbols in descending order.
2. Start from the largest value, 1000.
3. If num is greater than or equal to the current value:
   - Add the corresponding Roman symbol to the result.
   - Subtract the value from num.
4. Continue until num is smaller than the current value.
5. Move to the next smaller Roman value.
6. Repeat until all values are processed and num becomes 0.
7. Return the resulting Roman numeral.

Time Complexity: O(1)
Space Complexity: O(1) excluding the output string.
*/