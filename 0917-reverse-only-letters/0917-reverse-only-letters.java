class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
/*
Algorithm: Using teo pointers
1. Convert the input string into a character array.
2. Initialize two pointers: left = 0 and right = s.length() - 1.
3. While left < right:
   - If arr[left] is not a letter, increment left.
   - Else if arr[right] is not a letter, decrement right.
   - Otherwise, swap arr[left] and arr[right], then increment left and decrement right.
4. Convert the character array back into a string and return it.
Complexity
Time Complexity: O(n)
Space Complexity: O(n)
*/ 