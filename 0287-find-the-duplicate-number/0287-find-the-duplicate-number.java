class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance of the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
// Algorithm:
// 1. Initialize two pointers, slow and fast, at nums[0].
// 2. Move slow by one step and fast by two steps.
// 3. Continue until both pointers meet.
// 4. Reset slow to nums[0] while keeping fast at the meeting point.
// 5. Move both pointers one step at a time.
// 6. When they meet again, return that value.
// 7. The meeting point is the duplicate number.