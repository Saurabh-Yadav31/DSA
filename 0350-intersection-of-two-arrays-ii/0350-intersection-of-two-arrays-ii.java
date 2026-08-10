class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

// Algorithm:
// 1. Create a HashMap to store each number and its frequency from nums1.
// 2. Traverse nums1 and increase the frequency of each number.
// 3. Create an ArrayList to store the intersection.
// 4. Traverse nums2.
// 5. If the current number exists in the map and its frequency is greater than 0,
//    add it to the result.
// 6. Decrease its frequency in the map.
// 7. Convert the ArrayList into an int array.
// 8. Return the answer.
//Time: O(n + m) average
//Space: O(n) auxiliary space, excluding the returned result.