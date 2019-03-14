package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode tn = queue.poll();
            result.add(tn.val);
            if (tn.left != null) queue.offer(tn.left);
            if (tn.right != null) queue.offer(tn.right);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(6);
        root1.left = root1l;
        root1.right = root1r;
        root1l.left = new TreeNode(1);
        root1l.right = new TreeNode(3);
        root1r.left = new TreeNode(5);
        root1r.right = new TreeNode(7);

        PrintFromTopToBottom pfttb = new PrintFromTopToBottom();
        ArrayList<Integer> al = pfttb.printFromTopToBottom(root1);
        for (int i : al) {
            System.out.println(i);
        }
    }
}
