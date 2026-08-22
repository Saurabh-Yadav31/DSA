class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if (map.containsKey(count)) {
                int length = i - map.get(count);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}
// Algorithm:
// 1. Create a HashMap to store:
//      running count → first index where that count appeared.
// 2. Initialize count = 0 and maxLength = 0.
// 3. Store count 0 at index -1 in the HashMap.
//    This handles subarrays that start from index 0.
// 4. Traverse the array from left to right.
// 5. For every element:
//      - If the element is 0, decrease count by 1.
//      - If the element is 1, increase count by 1.
// 6. Check if the current count already exists in the HashMap.
//      - If it exists, calculate:
//            current index - first index
//        and update maxLength.
//      - If it does not exist, store the current count
//        with the current index.
// 7. Return maxLength.