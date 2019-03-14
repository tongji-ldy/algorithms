package leetCode;

import java.util.Stack;

public class Convert {
    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode copy = root;
        TreeNode pre = null;
        boolean isFirst = true;
        while (copy != null || !stack.isEmpty()) {
            while (copy != null) {
                stack.push(copy);
                copy = copy.left;
            }
            copy = stack.pop();
            if (isFirst) {
                root = copy;
                pre = root;
                isFirst = false;
            } else {
                pre.right = copy;
                copy.left = pre;
                pre = copy;
            }
            copy = copy.right;
        }
        return root;
    }
}
