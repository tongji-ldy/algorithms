package offer.tree2;

import offer.tree.TreeNode;

import java.util.ArrayList;

public class FindPath {
    private static ArrayList<ArrayList<Integer>> results = new ArrayList<>();
    private static ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        findPathHelp(root, target);
        return results;
    }

    public static void findPathHelp(TreeNode root, int target) {
        if (root == null) return;

        result.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            results.add(new ArrayList<>(result));
        }
        findPathHelp(root.left, target);
        findPathHelp(root.right, target);
        result.remove(result.size() - 1);
    }
}
