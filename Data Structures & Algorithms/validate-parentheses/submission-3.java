class Solution {
    public boolean isValid(String s) {
    // if open bracket, then push it to stack, if close bracket, then check if the top of stack is open bracket or not, if not return false
    Stack<Character> stack = new Stack<Character>();
    for(int i=0;i<s.length();i++) {
        char c = s.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '['))
                return false;
        }
    }
    return stack.empty();
}
}
