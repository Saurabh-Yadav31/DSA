class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }
        return result.reverse().toString();
    }
}
/*
1. Initialize two pointers, i = num1.length() - 1 and j = num2.length() - 1, to traverse both strings from right to left.
2. Initialize carry = 0 and a StringBuilder named result.
3. While i >= 0, j >= 0, or carry > 0:
   - Initialize sum = carry.
   - If i >= 0, add the digit from num1 to sum and decrement i.
   - If j >= 0, add the digit from num2 to sum and decrement j.
   - Append sum % 10 to result.
   - Update carry = sum / 10.
4. Reverse result because the digits were appended from right to left.
5. Return result.toString().
Complexity
- Time Complexity: \(O(\max(n,m))\) — each digit is processed once, and reversing the result takes linear time.
- Space Complexity: \(O(\max(n,m))\) — the StringBuilder stores the resulting sum.
*/