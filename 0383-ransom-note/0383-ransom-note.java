class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            count[ransomNote.charAt(i) - 'a']--;

            if (count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;  
    }
}

// Algorithm: (Similar to how I solved valid anagram)
// 1. Create an integer array of size 26 to store character frequencies.
// 2. Traverse the magazine string and increase the count of each character.
// 3. Traverse the ransomNote string.
// 4. For each character, decrease its available count.
// 5. If the count becomes negative, return false because the magazine
//    does not contain enough of that character.
// 6. If the entire ransomNote is processed successfully, return true.
/*
Time: O(n + m)
n = length of magazine
m = length of ransomNote
Space: O(1) because the array always has only 26 elements.
*/