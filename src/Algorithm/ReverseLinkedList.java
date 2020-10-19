package Algorithm;

public class ReverseLinkedList {
    // solution1:递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head; // 到最后一个节点了，直接返回
        }

        ListNode newHead = reverseList1(head.next); // 这个节点要一直返回到最上层
        head.next.next = head; // 把自己前一个节点放到自己的下一个节点
        head.next = null;
        return newHead;
    }

    // solution2:非递归
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        ListNode temp;

        while (cur != null) {
            temp = cur.next; // 保存下一个要处理的节点
            cur.next = prev; // 把自己的前一个节点放到自己的下一个节点
            prev = cur;      // 要处理的节点依次往后推后一个
            cur = temp;
        }

        head.next = null;
        return prev;
    }
}
