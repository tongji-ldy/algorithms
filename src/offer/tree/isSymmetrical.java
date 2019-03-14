package offer.tree;
/**
 * 题目：对称的二叉树。请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * 思路：中序遍历，判断这个序列是否对称。
 * 关键字：
 */

import java.util.ArrayList;

public class isSymmetrical {
    private ArrayList<Character> al = new ArrayList<>();

    boolean isSymmetrical(TreeNode pRoot) {
        isSymmetricalLDR(pRoot);
        int len = al.size();
        for (int i = 0; i < len / 2; i++) {
            if (al.get(i) != al.get(len - 1 - i)) return false;
        }
        return true;
    }

    private void isSymmetricalLDR(TreeNode pRoot) {
        if (pRoot == null) return;
        isSymmetricalLDR(pRoot.left);
        if (pRoot.left == null && pRoot.right != null) {
            al.add('#');
            al.add((char) pRoot.val);
        } else if (pRoot.right == null && pRoot.left != null) {
            al.add((char) pRoot.val);
            al.add('#');
        } else {
            al.add((char) pRoot.val);
        }

        isSymmetricalLDR(pRoot.right);
    }
}

/*思路：首先根节点以及其左右子树，左子树的左子树和右子树的右子树相同
 * 左子树的右子树和右子树的左子树相同即可，采用递归
 * 非递归也可，采用栈或队列存取各级子树根节点
 */
//public class Solution {
//    boolean isSymmetrical(TreeNode pRoot)
//    {
//        if(pRoot == null){
//            return true;
//        }
//        return comRoot(pRoot.left, pRoot.right);
//    }
//    private boolean comRoot(TreeNode left, TreeNode right) {
//        // TODO Auto-generated method stub
//        if(left == null) return right==null;
//        if(right == null) return false;
//        if(left.val != right.val) return false;
//        return comRoot(left.right, right.left) && comRoot(left.left, right.right);
//    }
//}
