package leetCode;

import com.sun.org.apache.regexp.internal.RE;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.LinkedList;

public class Print2 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) return result;
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(pRoot);
        queue.add(null);
        TreeNode temp;
        while (queue.size() > 1) {
            if (queue.peek() == null) {
                queue.poll();
                queue.add(null);
                result.add(al);
                al = new ArrayList<>();
            }
            temp = queue.poll();
            al.add(temp.val);
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        result.add(al);
        return result;
    }
}
