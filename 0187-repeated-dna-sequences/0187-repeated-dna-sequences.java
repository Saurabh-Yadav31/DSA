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
/*
1.Create a HashMap to store each 10-character DNA sequence and its frequency.
2.Traverse the string from index 0 to s.length() - 10.
3.Extract the 10-character substring starting at the current index.
4.Add the substring to the HashMap and increase its frequency.
5.Traverse through all sequences stored in the HashMap.
6.If a sequence appears more than once, add it to the result list.
7.Return the result list.

Time Complexity: O(n)
Space Complexity: O(n)
*/