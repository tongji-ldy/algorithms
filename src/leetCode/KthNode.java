package leetCode;

import java.util.ArrayList;

public class KthNode {
    ArrayList<TreeNode> result = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k < 1 || pRoot == null) return null;
        mid(pRoot);
        if (k > result.size()) return null;
        return result.get(k - 1);
    }

    public void mid(TreeNode root) {
        if (root == null) return;
        mid(root.left);
        result.add(root);
        mid(root.right);
    }
}
