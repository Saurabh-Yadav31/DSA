class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;

        int[] prefix = new int[n + 1];
        int baseSatisfied = 0;

        // Customers already satisfied normally
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
            if (grumpy[i] == 1) {
                prefix[i + 1] = prefix[i] + customers[i];
            } else {
                prefix[i + 1] = prefix[i];
            }
        }
        int maxExtra = 0;

        // Try every possible minutes window
        for (int i = 0; i <= n - minutes; i++) {
            int extra = prefix[i + minutes] - prefix[i];
            maxExtra = Math.max(maxExtra, extra);
        }
        return baseSatisfied + maxExtra;
    }
}
/*
Initialize baseSatisfied = 0.
Create a prefix sum array prefix of size n + 1.
Traverse the array:
If grumpy[i] == 0, add customers[i] to baseSatisfied.
If grumpy[i] == 1, add customers[i] to the prefix sum.
Try every possible starting position of the minutes window.
Calculate the extra customers satisfied in the window using prefix[i + minutes] - prefix[i].
Store the maximum extra customers in maxExtra.
Return baseSatisfied + maxExtra.

Time Complexity: O(n)
Space Complexity: O(n)
*/