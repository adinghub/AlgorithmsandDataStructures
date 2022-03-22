package LinkedList;

/**
 * @author Qidong Ding
 * @description TODO： 链表
 * @date 2022-03-21-20:30
 * @since JDK 1.8
 */

public class LinkedList<E> {

    // 链表的大小
    int size;
    // 虚拟头节点
    private Node dummyHead;

    public LinkedList() {
        // 虚拟头结点 元素和 next 为空
        dummyHead = new Node(null, null);
        size = 0;
    }

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    /**
     * 获取链表中元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 链表是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头添加元素 e
     */
    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        add(0,e);
    }

    /**
     * 在链表的 index 位置添加元素 e
     * 只是练习使用
     */
    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("参数不合法");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
//        Node node = new Node(e);
//        node.next = prev.next;
//        prev.next = node;

        prev.next = new Node(e,prev.next);
        size++;
    }

    /**
     * 在链表的末尾添加 元素
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 获得链表的第 index 位置的元素
     * 练习使用
     */
    public E get(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("参数不合法");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获得链表的第一个元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获得链表的最后一个元素
     */
    public E getLast(int index) {
        return get(size);
    }

    /**
     * 修改 index 位置的元素 为 e
     */
    public void set(int index, E e) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("参数不合法");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 查找链表中是否存在 e
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除链表 index 位置的元素
     */
    public E remove(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("参数不合法");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    /**
     * 删除第一个位置的元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个位置的元素
     */
    public E removeLast() {
        return remove(size-1);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }

        // 与上面 while 等价
//        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
//            res.append(cur + "->");
//        }
        return res.toString();
    }
}
