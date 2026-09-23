import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
/*
1.Initialize left = 0, maxLength = 0, and a HashMap to store the frequency of each fruit in the current window.
2.Traverse the array using right.
3.Add fruits[right] to the HashMap and increase its frequency.
4.If the HashMap contains more than 2 distinct fruit types:
4(a).Decrease the frequency of fruits[left].
4(b).If its frequency becomes 0, remove it from the HashMap.
4(b).Move left forward.
5.Calculate the current window length using right - left + 1.
6.Update maxLength with the maximum window length.
7.Return maxLength.

Time Complexity: O(n)
Space Complexity: O(1)
*/