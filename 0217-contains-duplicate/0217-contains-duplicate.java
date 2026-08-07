class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false; 
    }
}

// Algorithm
// 1. Create a HashSet.
// 2. Traverse the array.
// 3. If the current element already exists in the HashSet,
//    return true.
// 4. Otherwise, add the current element to the HashSet.
// 5. If the traversal completes without finding duplicates,
//    return false.