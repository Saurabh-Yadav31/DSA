class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if (map.containsKey(count)) {
                int length = i - map.get(count);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}