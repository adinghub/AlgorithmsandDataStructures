package Stack;

import LinkedList.LinkedList;

/**
 * @author Qidong Ding
 * @description TODO：链表实现栈
 * @date 2022-03-22-19:42
 * @since JDK 1.8
 */

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedListStack() {
        this.linkedList = new LinkedList<E>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top");
        res.append(linkedList);
        return res.toString();
    }
}
