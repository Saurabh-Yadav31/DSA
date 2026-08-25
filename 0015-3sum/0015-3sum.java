import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
/*
Solution 1: Sorting + Two Pointers + Skip Duplicates
1. If the array is null or has fewer than 3 elements, return an empty list.
2. Sort the array.
3. Fix one element using index i.
4. Set left = i + 1 and right = n - 1.
5. If nums[i] is the same as the previous element, skip it to avoid duplicate triplets.
6. Calculate sum = nums[i] + nums[left] + nums[right].
7. If sum == 0:
   - Add the triplet to the result.
   - Move both left and right.
   - Skip duplicate values for left and right.
8. If sum < 0, move left forward.
9. If sum > 0, move right backward.
10. Repeat until all possible values of i are checked.
11. Return the result list.
Time Complexity: O(n²)
Space Complexity: O(1) auxiliary space.


Solution 2: Sorting + Two Pointers + HashSet
1. If the array is null or has fewer than 3 elements, return an empty list.
2. Sort the array.
3. Create a HashSet to store unique triplets.
4. Fix one element using index i.
5. Set left = i + 1 and right = n - 1.
6. Calculate sum = nums[i] + nums[left] + nums[right].
7. If sum == 0:
   - Create the triplet.
   - Add the triplet to the HashSet.
   - Move left and right to search for another triplet.
8. If sum < 0, move left forward.
9. If sum > 0, move right backward.
10. Repeat until all possible values of i are checked.
11. Convert the HashSet into a List and return it.
Time Complexity: O(n²)
Space Complexity: O(k), where k is the number of unique triplets stored in the result.
*/