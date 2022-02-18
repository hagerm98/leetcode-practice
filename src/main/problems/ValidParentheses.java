package main.problems;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty() || ! compareParentheses(stack.peek(), s.charAt(i))) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }

    private boolean compareParentheses (Character a, Character b) {
        if (a == '(' && b == ')') {
            return true;
        } else if (a == '[' && b == ']') {
            return true;
        } else return a == '{' && b == '}';
    }
}
