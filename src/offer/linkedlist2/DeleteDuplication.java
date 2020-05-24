package offer.linkedlist2;

public class DeleteDuplication {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) { // ֻ��0����1����㣬�򷵻�
            return pHead;
        }
        if (pHead.val == pHead.next.val) { // ��ǰ������ظ����
            ListNode pNode = pHead.next;
            while (pNode != null && pNode.val == pHead.val) {
                // ����ֵ�뵱ǰ�����ͬ��ȫ�����,�ҵ���һ���뵱ǰ��㲻ͬ�Ľ��
                pNode = pNode.next;
            }
            return deleteDuplication(pNode); // �ӵ�һ���뵱ǰ��㲻ͬ�Ľ�㿪ʼ�ݹ�
        } else { // ��ǰ��㲻���ظ����
            pHead.next = deleteDuplication(pHead.next); // ������ǰ��㣬����һ����㿪ʼ�ݹ�
            return pHead;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        deleteDuplication(node);
    }
}
