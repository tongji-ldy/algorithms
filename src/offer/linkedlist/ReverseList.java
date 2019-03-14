package offer.linkedlist;

/**
 * 题目：反转链表。输入一个链表，反转链表后，输出新链表的表头。
 * 思路：利用两个指针，一个指向前结点，一个指向当前结点
 * 关键字：反转链表。
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
