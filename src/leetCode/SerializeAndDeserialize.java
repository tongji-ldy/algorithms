package leetCode;

public class SerializeAndDeserialize {
    private StringBuilder result = new StringBuilder();
    private int index = -1;

    String Serialize(TreeNode root) {
        if (root == null) return "";
        tree2Str(root);
        return result.toString();
    }

    public void tree2Str(TreeNode root) {
        if (root == null) {
            result.append("#,");
            return;
        }
        result.append(root.val + ",");
        tree2Str(root.left);
        tree2Str(root.right);
    }

    TreeNode Deserialize(String str) {
        if (str.length() == 0) return null;
        String[] strs = str.split(",");
        return str2Tree(strs);
    }

    public TreeNode str2Tree(String[] strs) {
        index++;
        if (!strs[index].equals("#")) {
            TreeNode t = new TreeNode(Integer.parseInt(strs[index]));
            t.left = str2Tree(strs);
            t.right = str2Tree(strs);
            return t;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(4);
        TreeNode p1_1 = new TreeNode(2);
        TreeNode p1_2 = new TreeNode(6);
        TreeNode p2_1 = new TreeNode(1);
        TreeNode p2_2 = new TreeNode(3);
        TreeNode p2_3 = new TreeNode(5);
        TreeNode p2_4 = new TreeNode(7);
        p.left = p1_1;
        p.right = p1_2;
        p1_1.left = p2_1;
        p1_1.right = p2_2;
        p1_2.left = p2_3;
        p1_2.right = p2_4;

        SerializeAndDeserialize sad = new SerializeAndDeserialize();
        System.out.println(sad.Serialize(p));
    }
}
