class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
        
    }
}
// Algorithm:
// 1. Create a HashMap where key = number and value = its latest index.
// 2. Traverse the array.
// 3. If the number already exists, calculate the index difference.
// 4. If the difference is <= k, return true.
// 5. Otherwise update the number's index to the current index.
// 6. If no valid duplicate is found, return false.