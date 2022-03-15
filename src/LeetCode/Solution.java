package LeetCode;


import Stack.ArrayStack;

/**
 * @author Qidong Ding
 * @description TODO：有效的括号
 * @date 2022-03-14-22:38
 * @since JDK 1.8
 */

public class Solution {
    public boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop();
                if (s.charAt(i) == ')' && top != '(') {
                    return false;
                }else if (s.charAt(i) == ']' && top != '[') {
                    return false;
                }else if (s.charAt(i) == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
    }
}
