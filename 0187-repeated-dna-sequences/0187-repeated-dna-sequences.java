class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() < 10) {
            return result;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();

        int code = 0;

        for (int i = 0; i < 10; i++) {
            code = (code << 2) | map.get(s.charAt(i));
        }

        seen.add(code);

        for (int i = 10; i < s.length(); i++) {
            code = ((code << 2) | map.get(s.charAt(i))) & ((1 << 20) - 1);

            if (seen.contains(code)) {
                if (!added.contains(code)) {
                    result.add(s.substring(i - 9, i + 1));
                    added.add(code);
                }
            } else {
                seen.add(code);
            }
        }
        return result;
    }
}
/*Algorithm — LeetCode 187: Repeated DNA Sequences

1. Assign 2 bits to each DNA character:
   - A → 00
   - C → 01
   - G → 10
   - T → 11
2. Encode the first 10 characters into an integer.
3. Store the encoded value in a HashSet called `seen`.
4. Slide the 10-character window through the string.
5. For each new character:
   - Shift the current code left by 2 bits.
   - Add the new character's 2-bit value.
   - Keep only the last 20 bits to maintain a 10-character window.
6. If the encoded value already exists in `seen`, the sequence is repeated.
7. Add the sequence to the result only once using another HashSet.
8. Otherwise, add the encoded value to `seen`.
9. Return the result list.

Time Complexity: O(n)
Space Complexity: O(n)
*/