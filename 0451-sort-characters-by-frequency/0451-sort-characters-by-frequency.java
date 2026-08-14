/*
class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        char[] answer = new char[s.length()];
        int index = 0;

        for (char c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                answer[index] = c;
                index++;
            }
        }
        return new String(answer);
    }
}
// Algorithm: (HashMap + Sorting (First Approach arrived))
// 1. Create a HashMap to store each character and its frequency.
// 2. Traverse the string and calculate the frequency of each character.
// 3. Create a list of the unique characters from the HashMap.
// 4. Sort the characters based on their frequency in descending order.
// 5. Create a char array of size s.length() for the output.
// 6. Traverse the sorted characters.
// 7. Add each character to the output according to its frequency.
// 8. Convert the char array into a String and return it.

Complexity
Let n = s.length() and k = number of distinct characters.
Time: O(n + k log k)
Space: O(n + k) including the output array.

The important distinction is:
HashMap       → stores frequency
ArrayList     → stores unique characters temporarily for sorting
char[]        → stores the final answer
*/

import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        ArrayList<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char c : map.keySet()) {
            int frequency = map.get(c);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(c);
        }

        char[] answer = new char[s.length()];
        int index = 0;

        for (int frequency = s.length(); frequency > 0; frequency--) {

            if (bucket[frequency] != null) {

                for (char c : bucket[frequency]) {

                    for (int i = 0; i < frequency; i++) {
                        answer[index] = c;
                        index++;
                    }
                }
            }
        }

        return new String(answer);
    }
}