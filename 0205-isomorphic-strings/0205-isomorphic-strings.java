// Algorithm: (Fixed Array Approach)
// 1. If the lengths of s and t are different, return false.
// 2. Create two arrays of size 256:
//      - mapST for mapping s → t.
//      - mapTS for mapping t → s.
// 3. Traverse both strings simultaneously.
// 4. For every pair of characters:
//      - Check whether the current character from s is already
//        mapped to a different character in t.
//      - Check whether the current character from t is already
//        mapped to a different character in s.
// 5. If either mapping conflicts, return false.
// 6. Store both mappings in the arrays.
// 7. After traversing the strings, return true.
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST[a] != 0 && mapST[a] != b) {
                return false;
            }

            if (mapTS[b] != 0 && mapTS[b] != a) {
                return false;
            }
            mapST[a] = b;
            mapTS[b] = a;
        }
        return true;
    }
}

/* (Using HashMap)
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST.containsKey(a) && mapST.get(a) != b) {
                return false;
            }
            if (mapTS.containsKey(b) && mapTS.get(b) != a) {
                return false;
            }
            mapST.put(a, b);
            mapTS.put(b, a);
        }
        return true;
    }
}
// Algorithm:
// 1. If the lengths of s and t are different, return false.
// 2. Create two HashMaps:
//      - One for mapping characters from s → t.
//      - One for mapping characters from t → s.
// 3. Traverse both strings simultaneously.
// 4. For every pair of characters:
//      - Check if s character is already mapped to a different t character.
//      - Check if t character is already mapped to a different s character.
// 5. If either mapping conflicts, return false.
// 6. Otherwise, store both mappings.
// 7. After traversing the strings, return true.
//Time: O(n) — we traverse the strings once.
//Space: O(n) — in the worst case, the HashMaps store n character mappings.
*/
