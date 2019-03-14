package leetCode;

import java.util.HashMap;

public class deleteDuplication {
//    public ListNode deleteDuplication(ListNode pHead) {
//        ListNode copy = pHead;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        while (copy != null) {
//            Integer value = hm.get(copy.val);
//            int count = 1;
//            if (value != null) {
//                count = value + 1;
//            }
//            hm.put(copy.val, count);
//            copy = copy.next;
//        }
//
//        ListNode pre = new ListNode(-1);
//        hm.put(pre.val, 1);
//        pre.next = pHead;
//        copy = pre;
//        while (copy.next != null) {
//            if (hm.get(copy.next.val) != 1) {
//                for (int i = 0; i < hm.get(copy.next.val)-1; i++) {
//                    copy.next = copy.next.next;
//                }
//            }
//            copy = copy.next;
//        }
//        return pre.next;
//    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) { // 只有0个或1个结点，则返回
            return pHead;
        }
        if (pHead.val == pHead.next.val) { // 当前结点是重复结点
            ListNode pNode = pHead.next;
            while (pNode != null && pNode.val == pHead.val) {
                // 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
                pNode = pNode.next;
            }
            return deleteDuplication(pNode); // 从第一个与当前结点不同的结点开始递归
        } else { // 当前结点不是重复结点
            pHead.next = deleteDuplication(pHead.next); // 保留当前结点，从下一个结点开始递归
            return pHead;
        }
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(2);
        ListNode p5 = new ListNode(3);
        ListNode p6 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        deleteDuplication dd = new deleteDuplication();
        ListNode result = dd.deleteDuplication(p1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
