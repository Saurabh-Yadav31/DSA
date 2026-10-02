class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
/*
Algorithm
1. Initialize i at the last index of the string and count = 0.
2. Move i backward while the current character is a space to skip trailing spaces.
3. Continue moving i backward while the current character is not a space.
4. Increment count for each character of the last word.
5. Return count.
Time Complexity: O(n)
Space Complexity: O(1)
*/