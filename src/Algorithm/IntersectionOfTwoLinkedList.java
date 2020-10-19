package Algorithm;

public class IntersectionOfTwoLinkedList {
    // 获取两条链表的交点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lengthA = getLength(headA), lengthB = getLength(headB);

        // 先让A或者B走两者长度之差的步数，让两者到交点的距离相同
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                nodeA = nodeA.next;
            }
        } else if (lengthA < lengthB) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                nodeB = nodeB.next;
            }
        }

        while (nodeA != null && nodeB != null) {
            if (nodeA == nodeB) {
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;
    }

    // 获取链表的长度
    int getLength(ListNode head) {
        ListNode cur = head;
        int length = 0;

        while (cur != null) {
            cur = cur.next;
            length++;
        }

        return length;
    }
}
