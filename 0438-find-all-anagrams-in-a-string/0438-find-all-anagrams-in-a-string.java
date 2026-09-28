class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }
        int[] countP = new int[26];
        int[] countWindow = new int[26];

        int k = p.length();

        // Frequency of characters in p
        for (int i = 0; i < k; i++) {
            countP[p.charAt(i) - 'a']++;
        }
        // First window
        for (int i = 0; i < k; i++) {
            countWindow[s.charAt(i) - 'a']++;
        }
        // Check first window
        if (Arrays.equals(countP, countWindow)) {
            result.add(0);
        }
        // Slide the window
        for (int i = k; i < s.length(); i++) {
            countWindow[s.charAt(i) - 'a']++;
            countWindow[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(countP, countWindow)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}
/* Algorithm
1.Create a frequency array countP for the characters in p.
2.Create a frequency array countWindow for the current window in s.
3.Set the window size equal to p.length().
4.Calculate the frequency of characters in the first window of s.
5.Compare countP and countWindow. If they are equal, add index 0 to the result.
6.Slide the window one position at a time:
    6(a).Add the new character entering the window.
    6(b).Remove the character leaving the window.
7.Compare the two frequency arrays after each movement.
8.If they are equal, add the starting index of the current window to the result.
9.Return the result.

Time Complexity: O(26 × n) → O(n)
Space Complexity: O(26) → O(1)
*/