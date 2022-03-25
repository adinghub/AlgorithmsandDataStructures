package LeetCode;

/**
 * @author Qidong Ding
 * @description TODO： 206. 反转链表
 * @date 2022-03-25-20:33
 * @since JDK 1.8
 */

public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = new ListNode(arr);
        反转链表 reverseList = new 反转链表();
        System.out.println(reverseList.reverseList(head));
    }
}
