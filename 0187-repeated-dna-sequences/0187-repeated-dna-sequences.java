class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10);

            map.put(sequence, map.getOrDefault(sequence, 0) + 1);
        }

        for (String sequence : map.keySet()) {
            if (map.get(sequence) > 1) {
                result.add(sequence);
            }
        }

        return result;
    }
}