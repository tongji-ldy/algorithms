package leetCode;

public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode copy = head;
        int length = 0;
        while (copy != null) {
            copy = copy.next;
            length++;
        }
        if (k > length) return null;
        for (int i = 0; i < length - k; i++) {
            head = head.next;
        }
        return head;
    }
}
