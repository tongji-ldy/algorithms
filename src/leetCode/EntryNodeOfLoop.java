package leetCode;

import java.util.HashSet;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) return null;
        HashSet<ListNode> hs = new HashSet<>();
        ListNode copy = pHead;

        while (copy != null) {
            if (!hs.add(copy)) return copy;
            copy = copy.next;
        }
        return null;
    }
}
