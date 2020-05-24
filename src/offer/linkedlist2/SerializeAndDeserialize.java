package offer.linkedlist2;

public class SerializeAndDeserialize {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static StringBuilder s = new StringBuilder();

    public static String serialize(TreeNode root) {
        serializeHelp(root);
        return s.toString();
    }

    private static void serializeHelp(TreeNode root) {
        if (root == null) {
            s.append("#,");
            return;
        }
        s.append(root.val + ",");
        serializeHelp(root.left);
        serializeHelp(root.right);
    }

    private static int index = -1;

    public static TreeNode deserialize(String s) {
        String[] ss = s.split(",");
        return deserializeHelp(ss);
    }

    private static TreeNode deserializeHelp(String[] ss) {
        index++;
        if (!ss[index].equals("#")) {
            TreeNode t = new TreeNode(Integer.parseInt(ss[index]));
            t.left = deserializeHelp(ss);
            t.right = deserializeHelp(ss);
            return t;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(serialize(root));
        TreeNode head = deserialize(serialize(root));
        System.out.println(serialize(head));
    }
}
