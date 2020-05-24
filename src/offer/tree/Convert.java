package offer.tree;

/**
 * 题目：二叉搜索树与双向链表。输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 思路：利用中序遍历。
 * 关键字：二叉搜索树，双向链表，中序遍历。
 */
public class Convert {
    TreeNode head = null;//链表头结点（即最左叶子结点），不移动
    TreeNode tail = null;//链表尾结点，从最左叶子结点按中序遍历顺序一直移动到最右叶子结点

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Convert(pRootOfTree.left);

        if (head == null) {
            head = pRootOfTree;
            tail = pRootOfTree;
        } else {
            tail.right = pRootOfTree;//tail的右指针指向当前结点
            pRootOfTree.left = tail;//当前结点的左指针指向tail结点
            tail = pRootOfTree;//将tail指向当前结点
        }

        Convert(pRootOfTree.right);
        return head;
    }
}
