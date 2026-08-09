class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] answer = new int[result.size()];

        int i = 0;
        for (int num : result) {
            answer[i] = num;
            i++;
        }
        return answer;      
    }
}
// Algorithm:
// 1. Create a HashSet and store all elements of nums1.
// 2. Create another HashSet to store the common elements.
// 3. Traverse nums2.
// 4. If the current element exists in the first HashSet,
//    add it to the result HashSet.
// 5. Convert the result HashSet into an int array.
// 6. Return the answer array.

//Time: O(n + m) average
//Space: O(n + m) in the worst case, including the result