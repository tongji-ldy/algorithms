package offer.linkedlist;

/**
 * 题目：链表中环的入口结点。给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 思路：利用hashSet不能存储相同元素的特性实现。
 * 关键字：环入口，hashSet。
 */

import java.util.HashSet;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode p = pHead;

        while (p != null) {
            if(hs.contains(p)) return p;
            hs.add(p);
            p = p.next;
        }

        return null;
    }
}
