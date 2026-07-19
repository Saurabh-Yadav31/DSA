import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {

        int[] frequency = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char ch : s.toCharArray()) {

            // Current character is now being processed
            frequency[ch - 'a']--;

            // Skip if already present in stack
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove larger characters if they appear later
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && frequency[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }

            // Add current character
            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}