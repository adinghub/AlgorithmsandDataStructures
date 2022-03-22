package LeetCode;

/**
 * @author Qidong Ding
 * @description TODO： 203. 移除链表元素
 * @date 2022-03-22-20:36
 * @since JDK 1.8
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null;
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode preNode = head;
        while (preNode.next != null) {
            if (preNode.next.val == val) {
//                ListNode delNode = preNode.next;
//                preNode.next = delNode.next;
//                delNode.next = null;
                preNode.next = preNode.next.next;
            }else {
                preNode = preNode.next;
            }
        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode preNode = dummyHead;
        while (preNode.next != null) {
            if (preNode.next.val == val) {
                preNode.next = preNode.next.next;
            }else {
                preNode = preNode.next;
            }
        }
        return dummyHead.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
