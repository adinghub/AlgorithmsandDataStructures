package Queue;

/**
 * @author Qidong Ding
 * @description TODO：
 * @date 2022-03-15-11:24
 * @since JDK 1.8
 */

public interface Queue<E> {

    /**
     * 获取队列的大小
     * @return
     */
    int getSize();

    /**
     * 队列是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 将一个元素 入队
     * @return
     */
    void enqueue(E e);

    /**
     * 将队首的元素 出队
     * @return
     */
    E dequeue();

    /**
     * 获取队首的 元素
     * @return
     */
    E getFront();

}
