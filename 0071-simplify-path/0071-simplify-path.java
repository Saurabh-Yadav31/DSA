class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
/* Algorithm : Using Stack
Algorithm
1. Split the given path using / to obtain individual components.
2. Initialize an empty stack to store directory names.
3. Iterate through each component:
   - If the component is empty or ".", ignore it.
   - If the component is "..", pop the top element if the stack is not empty.
   - Otherwise, push the directory name onto the stack.
4. Initialize a StringBuilder to construct the simplified path.
5. Iterate through the stack and append / followed by each directory name.
6. If the result is empty, return /; otherwise, return the simplified path.
Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)
*/