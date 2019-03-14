package leetCode;

public class Mirror {
    public void mirror(TreeNode root) {
        TreeNode temp;
        if (root != null) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirror(root.left);
            mirror(root.right);
        }
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

        Mirror m = new Mirror();
        m.mirror(root1);

    }
}
