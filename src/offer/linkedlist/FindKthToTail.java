package offer.linkedlist;

/**
 * 题目：链表中倒数第k个结点。输入一个链表，输出该链表中倒数第k个结点。
 * 思路：利用两个指针，两个指针间相差k单位，当第一个指针移动到链表末端时，第二个指针指向的便是倒数第k个。
 * 关键字：倒数第k个。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        ListNode pre = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
            if (count > k) {
                pre = pre.next;
            }
        }
        if (count < k) return null;
        else return pre;
    }
}
