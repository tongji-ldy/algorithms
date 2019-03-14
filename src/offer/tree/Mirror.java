package offer.tree;

/**
 * 题目：二叉树的镜像。操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路：两个对象交换。
 * 关键字：二叉树镜像。
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
