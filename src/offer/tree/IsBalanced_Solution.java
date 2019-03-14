package offer.tree;

/**
 * 题目：平衡二叉树。输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 思路：求出左右子树的高度差，<=1，则继续。
 * 关键字：平衡二叉树。
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root != null) {
            if (Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) <= 1) {
                IsBalanced_Solution(root.left);
                IsBalanced_Solution(root.right);
            } else return false;
        }
        return true;
    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
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
        System.out.println(TreeDepth(root1));
    }
}
