package offer.tree;

import java.util.ArrayList;

/**
 * 题目：二叉树中和为某一路径的值。输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * 思路：见注释
 * 关键字：二叉树路径
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return result;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(path));//必须创建新的list，将path复制进这个新的list中，不然操作的抑制是一个list.
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);//到叶子节点后回退父节点。
        return result;
    }
}
