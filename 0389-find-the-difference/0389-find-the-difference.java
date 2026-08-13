class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return result;
    }
}
// Algorithm: (Using XOR solution)
// 1. Create a char variable result and initialize it to 0.
// 2. Traverse string s and XOR every character with result.
// 3. Traverse string t and XOR every character with result.
// 4. Matching characters will cancel each other because x ^ x = 0.
// 5. The only character left will be the extra character in t.
// 6. Return result.
//Time: O(n)
//Space: O(1)

        
        
           
/*
// Algorithm: (Frequency array approach)
// 1. Create an integer array of size 26 to store character frequencies.
// 2. Traverse string s and increase the count of each character.
// 3. Traverse string t and decrease the count of each character.
// 4. Traverse the frequency array.
// 5. The character whose count is different represents the extra character.
// 6. Return that character.
//Time: O(n) — we traverse the two strings and then only 26 characters.
//Space: O(1) — the array always has exactly 26 positions.

class Solution {
    public char findTheDifference(String s, String t) {      
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}
*/