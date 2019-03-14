package leetCode;

public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while (pHead1 != null) {
            ListNode copy = pHead2;
            while (pHead1 != copy && copy != null) {
                copy = copy.next;
            }
            if (copy != null) break;
            else pHead1 = pHead1.next;
        }
        return pHead1;
    }
}
