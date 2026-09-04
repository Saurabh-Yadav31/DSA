class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {
            // Find next valid character in s
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            // Find next valid character in t
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            // One string has a valid character, the other doesn't
            if ((i >= 0) != (j >= 0)) {
                return false;
            }
            // Both have valid characters, but they are different
            if (i >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }

        return true;
    }
}
/* Optimal solution using pointers
1. Set i = s.length() - 1
   Set j = t.length() - 1
2. Set skipS = 0 and skipT = 0.
3. Move i backwards:
   - If s[i] == '#', increase skipS.
   - If skipS > 0, skip the current character and decrease skipS.
   - Otherwise, stop because s[i] is a valid character.
4. Do the same for j in t.
5. If one string has a valid character and the other doesn't,
   return false.
6. If both have valid characters and they are different,
   return false.
7. Move both pointers one position left.
8. Repeat until both strings are completely processed.
9. Return true.
Time:  O(n + m)
Space: O(1)
*/








/* Brute force approach
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
1. Create a StringBuilder for each string.
2. Traverse the string character by character.
3. If the character is not '#', add it to the StringBuilder.
4. If the character is '#':
   - If the StringBuilder is not empty, remove its last character.
5. Do the same for both strings.
6. Compare the two resulting strings.
7. If they are equal, return true; otherwise return false.
Time:  O(n + m)
Space: O(n + m)
*/