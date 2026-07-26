class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int n = num.length;

        for (int i = n - 1; i >= 0 || k > 0; i--) {

            int digit = 0;

            if (i >= 0) {
                digit = num[i];
            }

            int sum = digit + (k % 10);

            ans.add(0, sum % 10);

            k = (k / 10) + (sum / 10);
        }
        return ans;
    }
}