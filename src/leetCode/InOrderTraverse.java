package leetCode;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraverse {
    public ArrayList<Integer> inOrderTraverse(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode copy = root;

        while (!stack.empty()) {
            while (copy.left != null) {
                stack.push(copy.left);
                copy = copy.left;
            }

            while (!stack.empty()) {
                TreeNode t = stack.pop();
                result.add(t.val);
                if (t.right != null) {
                    stack.push(t.right);
                    copy = t.right;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(5);
        root1.left = root1l;
        root1.right = root1r;
        //root1l.left = new TreeNode(1);
        root1l.right = new TreeNode(3);
        root1r.left = new TreeNode(6);
        //root1r.right = new TreeNode(7);
        root1l.right.left = new TreeNode(4);
        root1r.left.left = new TreeNode(7);
        root1r.left.right = new TreeNode(8);

        InOrderTraverse iot = new InOrderTraverse();
        ArrayList<Integer> al = iot.inOrderTraverse(root1);
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
