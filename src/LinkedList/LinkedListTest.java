package LinkedList;

/**
 * @author Qidong Ding
 * @description TODO：测试 链表
 * @date 2022-03-21-21:19
 * @since JDK 1.8
 */

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
            System.out.println(linkedList.getSize());
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);

        System.out.println(linkedList.getSize());
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
