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
/*
1. Initialize a StringBuilder named result and a pointer i = 0.
2. While i is less than the length of word:
   - Store the current character in current.
   - Initialize count = 0.
3. Count consecutive occurrences of current while:
   - i is within the string.
   - The current character matches current.
   - count is less than 9.
4. Increment count and i for each matching character.
5. Append count followed by current to result.
6. Repeat until all characters are processed.
7. Return result.toString().
Complexity
- Time Complexity: \(O(n)\) — each character is processed once.
- Space Complexity: \(O(n)\) — the StringBuilder stores the compressed output.
*/