class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}
// Algorithm:
// 1. Create a HashSet to store the numbers that have already appeared.
// 2. While n is not equal to 1:
//    - If n already exists in the HashSet, a cycle is detected, so return false.
//    - Add n to the HashSet.
//    - Calculate the sum of squares of all digits of n.
//    - Set n equal to this sum.
// 3. If n becomes 1, return true.
