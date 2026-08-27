class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
// Algorithm:
// 1. Set i = m - 1, j = n - 1, and k = m + n - 1.
// 2. Traverse from the end while i >= 0 and j >= 0.
// 3. Compare nums1[i] and nums2[j].
// 4. Place the larger element at nums1[k].
// 5. Move the pointer of the element that was placed and decrement k.
// 6. If elements of nums2 are still remaining, copy them into nums1.
// 7. The array is now merged in sorted order.
// Time Complexity: O(m + n)
// Space Complexity: O(1)