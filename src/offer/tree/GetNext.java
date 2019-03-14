package offer.tree;

import java.util.ArrayList;

/**
 * 题目：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * 思路：如果有右子树，则找右子树的最左节点，没右子树，则找第一个当前节点是父节点左孩子的节点。
 * 关键字：中序遍历。
 */
public class GetNext {
//    private ArrayList<TreeLinkNode> al = new ArrayList<>();
//
//    public TreeLinkNode GetNext(TreeLinkNode pNode) {
//        TreeLinkNode pRoot = pNode;
//        while (pRoot.next != null) {
//            pRoot = pRoot.next;
//        }
//        getNextLDR(pRoot);
//        int index = al.indexOf(pNode);
//        return index == al.size() - 1 ? null : al.get(index + 1);
//    }
//
//    private void getNextLDR(TreeLinkNode pRoot) {
//        if (pRoot == null) return;
//        getNextLDR(pRoot.left);
//        al.add(pRoot);
//        getNextLDR(pRoot.right);
//    }

    TreeLinkNode GetNext(TreeLinkNode node)
    {
        if(node==null) return null;
        if(node.right!=null){    //如果有右子树，则找右子树的最左节点
            node = node.right;
            while(node.left!=null) node = node.left;
            return node;
        }
        while(node.next!=null){ //没右子树，则找第一个当前节点是父节点左孩子的节点
            if(node.next.left==node) return node.next;
            node = node.next;
        }
        return null;   //退到了根节点仍没找到，则返回null
    }
}
