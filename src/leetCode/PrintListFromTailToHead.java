package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        List<Integer> al = new ArrayList<>();
        while (listNode != null) {
            al.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(al);
        return (ArrayList<Integer>) al;
    }
}
