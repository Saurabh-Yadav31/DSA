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