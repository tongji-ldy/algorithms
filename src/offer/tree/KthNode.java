package offer.tree;
/**
 * 题目：二叉搜索树的第k个节点。给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * 思路：利用中序遍历得到的便是排序好的序列。
 * 关键字：中序遍历，排序。
 */

import java.util.ArrayList;

public class KthNode {
    ArrayList<TreeNode> al = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        kthNodeLDR(pRoot);
        if (k < 1 || k > al.size() || pRoot == null) return null;
        return al.get(k - 1);
    }

    void kthNodeLDR(TreeNode pRoot)
    {
        if (pRoot == null) return;
        kthNodeLDR(pRoot.left);
        al.add(pRoot);
        kthNodeLDR(pRoot.right);
    }
}
