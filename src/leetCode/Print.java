package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null) return ans;
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        queue.add(null);
        TreeNode temp;
        while (queue.size() > 1) {
            if (queue.peek() == null) {
                queue.poll();
                queue.add(null);
                ans.add(result);
                result = new ArrayList<>();
            }
            temp = queue.poll();
            result.add(temp.val);
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        ans.add(result);

        for (int i = 0; i < ans.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(ans.get(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Print pTest = new Print();

        TreeNode p = new TreeNode(4);
        TreeNode p1_1 = new TreeNode(2);
        TreeNode p1_2 = new TreeNode(6);
        TreeNode p2_1 = new TreeNode(1);
        TreeNode p2_2 = new TreeNode(3);
        TreeNode p2_3 = new TreeNode(5);
        TreeNode p2_4 = new TreeNode(7);

        p.left = p1_1;
        p.right = p1_2;
        p1_1.left = p2_1;
        p1_1.right = p2_2;
        p1_2.left = p2_3;
        p1_2.right = p2_4;

        ArrayList<ArrayList<Integer>> ans = pTest.Print(p);
        for (ArrayList<Integer> a : ans) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
