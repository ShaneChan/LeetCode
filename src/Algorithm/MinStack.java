package Algorithm;

import java.util.Stack;

// 最小栈
public class MinStack {
    private Stack<Integer> stack1; // 栈1用来做原来的栈
    private Stack<Integer> stack2; // 栈2用来存放出现过的最小值

    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.empty() || x <= stack2.peek()) {
            stack2.push(x);
        }
    }

    public void pop() {
        int x = stack1.pop();
        if (stack2.peek() == x) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
