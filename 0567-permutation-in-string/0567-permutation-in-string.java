class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches(count1, count2)) {
                return true;
            }
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - s1.length()) - 'a']--;
        }
        return matches(count1, count2);
    }

    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
/* Algorithm Fixed sliding window
1.If s1 is longer than s2, return false.
2.Create two frequency arrays of size 26:
    2(a).count1 for characters in s1.
    2(b).count2 for the current window in s2.
3.Create the first window in s2 with size s1.length().
4.Compare the frequency arrays.
5.Slide the window one position at a time:
    5(a).Add the new character entering the window.
    5(b).Remove the character leaving the window.
6.After each slide, compare the two frequency arrays.
7.If the frequencies match, the current window is a permutation of s1, so return true.
8.If no window matches, return false.

Time Complexity: O(26 × n) → O(n)
Space Complexity: O(26) → O(1)
*/