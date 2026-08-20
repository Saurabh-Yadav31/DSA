class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> mapPW = new HashMap<>();
        HashMap<String, Character> mapWP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = words[i];

            if (mapPW.containsKey(p) && !mapPW.get(p).equals(word)) {
                return false;
            }
            if (mapWP.containsKey(word) && mapWP.get(word) != p) {
                return false;
            }
            mapPW.put(p, word);
            mapWP.put(word, p);
        }
        return true;
    }
}
// Algorithm:
// 1. Split the string s into individual words.
// 2. If the number of words is not equal to the length of pattern,
//    return false.
// 3. Create two HashMaps:
//      - pattern → word
//      - word → pattern
// 4. Traverse the pattern and words simultaneously.
// 5. For each pattern character and word:
//      - Check if the pattern character is already mapped.
//      - Check if the word is already mapped.
// 6. If an existing mapping conflicts in either direction,
//    return false.
// 7. Otherwise, store both mappings.
// 8. After traversing everything successfully, return true.
//Time: O(n)
//Space: O(n)