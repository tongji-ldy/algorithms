package leetCode;

import java.math.BigInteger;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String add1 = "";
        String add2 = "";

        for (int i = 0; (l1 != null) || (l2 != null); i++) {
            if (l1 != null) {
                add1 = String.valueOf(l1.val) + add1;
                l1 = l1.next;
            }
            if (l2 != null) {
                add2 = String.valueOf(l2.val) + add2;
                l2 = l2.next;
            }
        }

        BigInteger bi1 = new BigInteger(add1);
        BigInteger bi2 = new BigInteger(add2);
        String sum = bi1.add(bi2).toString();
        ListNode[] ln = new ListNode[sum.length() + 1];
        ln[0] = new ListNode(Integer.parseInt("" + sum.charAt(sum.length() - 1)));

        for (int i = 1; i < sum.length(); i++) {
            ln[i] = new ListNode(Integer.parseInt("" + sum.charAt(sum.length() - i - 1)));
            ln[i - 1].next = ln[i];
        }

        return ln[0];
    }
}
