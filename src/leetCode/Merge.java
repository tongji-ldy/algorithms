package leetCode;

public class Merge {
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode curr = new ListNode(0);

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (head1 != null || head2 != null) {
            if (head1 == null) {
                curr.next = head2;
                break;
            }
            if (head2 == null) {
                curr.next = head1;
                break;
            }
            if (head1.val < head2.val) {
                curr.next = head1;
                curr = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                curr = head2;
                head2 = head2.next;
            }
        }
        return list1.val < list2.val ? list1 : list2;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        ListNode list6 = new ListNode(6);

        list1.next = list3;
        list3.next = list5;
        list2.next = list4;
        list4.next = list6;

        Merge m = new Merge();
        ListNode result = m.merge(list1, list2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
