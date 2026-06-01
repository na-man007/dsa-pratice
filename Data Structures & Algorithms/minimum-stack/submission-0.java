class MinStack {

    Stack<Integer> stack;
    int min;
    
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        stack.push(val);
        min = Math.min(min, val);
    }

    public void pop() {
        stack.pop();
         if (stack.isEmpty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = Integer.MAX_VALUE;
            for (int i : stack) {
                min = Math.min(min, i);
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
