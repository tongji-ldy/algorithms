package offer.linkedlist;

/**
 * 题目：合并两个排序的链表。输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 思路：利用递归。
 * 关键字：合并，排序，链表。
 */
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null || list2 == null) return list1 == null ? list2 : list1;

        if (list1.val < list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}

//public class Solution {
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        //新建一个头节点，用来存合并的链表。
//        ListNode head=new ListNode(-1);
//        head.next=null;
//        ListNode root=head;
//        while(list1!=null&&list2!=null){
//            if(list1.val<list2.val){
//                head.next=list1;
//                head=list1;
//                list1=list1.next;
//            }else{
//                head.next=list2;
//                head=list2;
//                list2=list2.next;
//            }
//        }
//        //把未结束的链表连接到合并后的链表尾部
//        if(list1!=null){
//            head.next=list1;
//        }
//        if(list2!=null){
//            head.next=list2;
//        }
//        return root.next;
//    }
//}
