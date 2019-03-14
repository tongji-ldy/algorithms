package leetCode;

public class HasSubtree {
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
        if(root1==null && root2!=null) return false;
        boolean flag = false;
        if(root1.val==root2.val){
            flag = equals(root1,root2);
        }
        if(!flag){
            flag = hasSubtree(root1.left, root2);
            if(!flag){
                flag = hasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    public boolean equals(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null && root2 != null) return false;
        if (root1.val == root2.val) {
            return equals(root1.left, root2.left) && equals(root1.right, root2.right);
        }
        return false;
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

        TreeNode root2 = new TreeNode(4);
        TreeNode root2l = new TreeNode(2);
        TreeNode root2r = new TreeNode(6);
        root2.left = root2l;
        root2.right = root2r;
        root2l.left = new TreeNode(1);
        root2l.right = new TreeNode(3);
        root2r.left = new TreeNode(5);
        root2r.right = new TreeNode(9);

        HasSubtree hs = new HasSubtree();
        System.out.println(hs.equals(root1, root2));
        System.out.println(hs.hasSubtree(root1, root2));

    }
}
