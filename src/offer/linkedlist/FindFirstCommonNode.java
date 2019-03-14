package offer.linkedlist;

/**
 * 题目：两个链表的第一个公共结点。输入两个链表，找出它们的第一个公共结点。
 * 思路：利用hashSet不能存储相同值的特性。
 * 关键字：公共结点，hashSet。
 */

import java.util.HashSet;

public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> hs = new HashSet<>();

        while (pHead1 != null) {
            hs.add(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null) {
            if (hs.contains(pHead2)) return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }
}

/*长度相同有公共结点，第一次就遍历到；没有公共结点，走到尾部NULL相遇，返回NULL
长度不同有公共结点，第一遍差值就出来了，第二遍一起到公共结点；没有公共，一起到结尾NULL。*/
//public class Solution {
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        ListNode p1=pHead1,p2=pHead2;
//        while(p1!=p2){
//            p1=p1==null?pHead1:p1.next;
//            p2=p2==null?pHead2:p2.next;
//        }
//        return p1;
//    }
//}
