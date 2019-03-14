package offer.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：二叉树的深度。输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 思路：见代码。
 * 关键字：深度，层序遍历。
 */
public class TreeDepth {
    //方法一，用递归
//    public int TreeDepth(TreeNode root) {
//        if (root == null) return 0;
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        return Math.max(left, right) + 1;
//    }

    //方法二，用层序遍历
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            TreeNode top = queue.poll();
            count++;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
            if(count == nextCount){//count=nextCount时表示该层元素从队列中全部弹出，队列中为下一层的所有元素
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }


}
