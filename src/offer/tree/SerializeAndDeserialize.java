package offer.tree;

/**
 * 题目：序列化二叉树。请实现两个函数，分别用来序列化和反序列化二叉树。
 * 思路：所谓序列化指的是遍历二叉树为字符串；所谓反序列化指的是依据字符串重新构造成二叉树。
 依据前序遍历序列来序列化二叉树，因为前序遍历序列是从根结点开始的。当在遍历二叉树时碰到Null指针时，这些Null指针被序列化为一个特殊的字符“#”。
 另外，结点之间的数值用逗号隔开。
 * 关键字：前序遍历，序列化，反序列化。
 */
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
        TreeNode root1 = new TreeNode(4);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(6);
        root1.left = root1l;
        root1.right = root1r;
        root1l.left = new TreeNode(1);
        root1l.right = new TreeNode(3);
        root1r.left = new TreeNode(5);
        root1r.right = new TreeNode(7);

        SerializeAndDeserialize sad = new SerializeAndDeserialize();
        //System.out.println(sad.Serialize(root1));
        TreeNode node = sad.Deserialize(sad.Serialize(root1));
        System.out.println(sad.Serialize(node));
    }
}
