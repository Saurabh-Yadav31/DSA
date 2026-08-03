class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {

        if (nums[j] != j + 1) {

        ans.add(j + 1);

        }
    }
    return ans;  
    }
}
// Algorithm:
// 1. Traverse the array using Cyclic Sort.
// 2. Every number x belongs at index x-1.
// 3. If the current number is not at its correct position,
//    swap it with the number at its correct position.
// 4. Continue until every possible number is placed correctly.
// 5. Traverse the array again.
// 6. If nums[i] != i+1,
//    then i+1 is the missing number.
// 7. Add all such numbers to an ArrayList.
// 8. Return the ArrayList.


