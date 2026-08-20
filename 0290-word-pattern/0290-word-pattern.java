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