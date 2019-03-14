package leetCode;

public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left != null && right != null) {
            return left.val == right.val && isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode p = new TreeNode(8);
        TreeNode p1_1 = new TreeNode(6);
        TreeNode p1_2 = new TreeNode(6);
        TreeNode p2_1 = new TreeNode(5);
        TreeNode p2_2 = new TreeNode(7);
        TreeNode p2_3 = new TreeNode(7);
        TreeNode p2_4 = new TreeNode(5);

        p.left = p1_1;
        p.right = p1_2;
        p1_1.left = p2_1;
        p1_1.right = p2_2;
        p1_2.left = p2_3;
        p1_2.right = p2_4;

        isSymmetrical is = new isSymmetrical();
        System.out.println(is.isSymmetrical(p));
    }
}
