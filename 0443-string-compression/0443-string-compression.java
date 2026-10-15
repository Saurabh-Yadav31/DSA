class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0;
        int write = 0;

        while (read < n) {
            char current = chars[read];
            int count = 0;
            while (read < n && chars[read] == current) {
                read++;
                count++;
            }
            chars[write++] = current;

            if (count > 1) {
                String num = String.valueOf(count);

                for (int i = 0; i < num.length(); i++) {
                    chars[write++] = num.charAt(i);
                }
            }
        }
        return write;
    }
}
/*
Algorithm — Two Pointers 
1. Initialize two pointers: read = 0 to traverse the array and write = 0 to store compressed characters.
2. While read is less than the array length:
   - Store the current character chars[read] in current.
   - Count its consecutive occurrences using the read pointer.
3. Write current to chars[write] and increment write.
4. If count > 1, convert the count into a string and write each digit into the array, incrementing write after each digit.
5. Repeat until all characters have been processed.
6. Return write, which represents the length of the compressed array.
Complexity
- Time Complexity: O(n)
- Auxiliary Space Complexity:O(1)
*/