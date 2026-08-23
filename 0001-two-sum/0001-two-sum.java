class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i <nums.length; i++){
            int diff = target - nums[i];

            if (map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
// Algorithm:
// 1. Create a HashMap to store:
//      number → index
// 2. Traverse the array from left to right.
// 3. For each element:
//      - Calculate the required difference:
//            diff = target - nums[i]
// 4. Check if diff already exists in the HashMap.
//      - If it exists, return the index of diff and the current index.
// 5. If diff does not exist, store the current number and its index
//    in the HashMap.
// 6. If no pair is found after traversing the array, return an empty array.
// Time Complexity: O(n)
// Space Complexity: O(n)