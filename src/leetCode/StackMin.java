package leetCode;

import java.util.Stack;

public class StackMin {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (node < min) {
            min = node;
        }
    }

    public void pop() {
        if (stack.peek() == min) {
            stack.pop();
            min = Integer.MAX_VALUE;
            while (!stack.empty()) {
                tempStack.push(stack.pop());
            }
            while (!tempStack.empty()) {
                this.push(tempStack.pop());
            }
        } else stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }

    public static void main(String[] args) {
        StackMin sm = new StackMin();
        sm.push(4);
        System.out.println(sm.min());
        sm.push(3);
        System.out.println(sm.min());
        sm.push(2);
        System.out.println(sm.min());
        sm.push(1);
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());
        sm.push(0);
        System.out.println(sm.min());
    }
}
