package Stack;

/**
 * @author Qidong Ding
 * @description TODO： 栈
 * @date 2022-03-14-22:04
 * @since JDK 1.8
 */

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
