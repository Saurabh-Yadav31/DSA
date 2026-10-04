import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
/*
1. Create a mapping for each Roman numeral to its integer value.
2. Initialize result = 0.
3. Traverse the string from left to right.
4. Get the value of the current Roman numeral.
5. If the current value is smaller than the next value, subtract the current value from result.
6. Otherwise, add the current value to result.
7. Return result.
Time Complexity: O(n)
Space Complexity: O(1)
*/