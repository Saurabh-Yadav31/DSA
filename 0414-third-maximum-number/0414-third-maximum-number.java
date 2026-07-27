class Solution {
    public int thirdMax(int[] nums) {

        // Use long to handle Integer.MIN_VALUE safely
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            // New maximum
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }

            // New second maximum
            else if (num > second) {
                third = second;
                second = num;
            }

            // New third maximum
            else if (num > third) {
                third = num;
            }
        }

        // If third maximum doesn't exist
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }
        return (int) third;
    }
}