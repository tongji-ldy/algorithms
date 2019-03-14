package offer.tree;
/**
 * 题目：把二叉树打印成多行。从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 思路：利用层序遍历，需要每层存储。
 * 关键字：层序遍历，按层存储。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrder {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return results;

        queue.offer(pRoot);
        int count = 0;
        int nextCount = 1;
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            result.add(node.val);
            count++;

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            if (count == nextCount) {
                results.add(new ArrayList<>(result));
                result.clear();
                nextCount = queue.size();
                count = 0;
            }
        }
        return results;
    }
}
