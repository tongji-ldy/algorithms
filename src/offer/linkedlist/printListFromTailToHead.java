package offer.linkedlist;

/**
 * 题目：从尾到头打印链表。输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思路：利用ArrayList的头插方法。
 * 关键字：逆序打印链表。
 */

import java.util.ArrayList;

public class printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        while (listNode != null) {
            result.add(0, listNode.val);//头插方法。
            listNode = listNode.next;
        }
        return result;
    }
}

//    java 递归超简洁版本
//public class Solution {
//    ArrayList<Integer> arrayList=new ArrayList<Integer>();
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if(listNode!=null){
//            this.printListFromTailToHead(listNode.next);
//            arrayList.add(listNode.val);
//        }
//        return arrayList;
//    }
//}
