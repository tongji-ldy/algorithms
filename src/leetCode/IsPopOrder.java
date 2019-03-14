package leetCode;

import java.util.Stack;

public class IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        stack.push(pushA[0]);
        for (int i = 0, j = 0; j < pushA.length; ) {
            if (stack.peek() != popA[i]) {
                j++;
                if (j > pushA.length - 1) return false;
                stack.push(pushA[j]);
            } else {
                stack.pop();
                i++;
            }
            if (stack.empty()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        IsPopOrder ipo = new IsPopOrder();
        System.out.println(ipo.isPopOrder(pushA, popA));
    }
}
