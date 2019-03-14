package leetCode;

import java.util.ArrayList;

public class GetNext {
    private ArrayList<TreeLinkNode> al = new ArrayList<>();

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;

        TreeLinkNode root = pNode;
        while (root.next != null) {
            root = root.next;
        }
        mid(root);

        int index = al.indexOf(pNode) + 1;
        return index > al.size() - 1 ? null : al.get(index);

    }

    public void mid(TreeLinkNode root) {
        if (root != null) {
            mid(root.left);
            al.add(root);
            mid(root.right);
        }
    }

    public static void main(String[] args) {
        TreeLinkNode p = new TreeLinkNode(4);
        TreeLinkNode p1_1 = new TreeLinkNode(2);
        TreeLinkNode p1_2 = new TreeLinkNode(6);
        TreeLinkNode p2_1 = new TreeLinkNode(1);
        TreeLinkNode p2_2 = new TreeLinkNode(3);
        TreeLinkNode p2_3 = new TreeLinkNode(5);
        TreeLinkNode p2_4 = new TreeLinkNode(7);

        p.left = p1_1;
        p.right = p1_2;
        p1_1.left = p2_1;
        p1_1.right = p2_2;
        p1_2.left = p2_3;
        p1_2.right = p2_4;


        GetNext gn = new GetNext();
        System.out.println(gn.GetNext(p).val);
        for (TreeLinkNode t : gn.al) {
            System.out.print(t.val + " ");
        }

    }
}
