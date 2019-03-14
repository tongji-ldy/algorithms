package offer.tree;

/**
 * 题目：按之字形打印二叉树。请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * 思路：按照层序遍历思想。
 * 关键字：之字形，层序遍历
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return results;

        queue.offer(pRoot);
        int count = 0;
        int nextCount = 1;
        boolean flag = false;
        TreeNode node = null;
        while (!queue.isEmpty()) {
            if (flag) {
                node = queue.pollLast();
                if (node.right != null) queue.offerFirst(node.right);
                if (node.left != null) queue.offerFirst(node.left);
            } else {
                node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(node.val);
            count++;

            if (count == nextCount) {
                results.add(new ArrayList<>(result));
                result.clear();
                flag = !flag;
                nextCount = queue.size();
                count = 0;
            }
        }
        return results;
    }
}
