class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;       
    }
}
// Algorithm: (Approach 1)
// 1. Check if the lengths of the two strings are different.
// 2. If they are different, return false.
// 3. Convert both strings into character arrays.
// 4. Sort both character arrays.
// 5. Compare the two sorted arrays.
// 6. If they are equal, return true.
// 7. Otherwise, return false.

// Algorithm:(Approach 2)
// 1. Check if the lengths of the two strings are different.
// 2. If they are different, return false.
// 3. Create an integer array of size 26 to store character frequencies.
// 4. Traverse the first string and increase the count of each character.
// 5. Traverse the second string and decrease the count of each character.
// 6. Traverse the count array.
// 7. If any count is not 0, return false.
// 8. If all counts are 0, return true.