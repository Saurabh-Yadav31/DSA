class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        ArrayList<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
     