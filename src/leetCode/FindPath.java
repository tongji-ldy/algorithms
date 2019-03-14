package leetCode;

import java.util.ArrayList;

public class FindPath {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return result;
        path.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(path));//此处需要新建，因为有多条路径
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);
        return result;
    }
}
