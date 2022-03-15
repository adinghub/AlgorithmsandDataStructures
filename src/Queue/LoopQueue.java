package Queue;

/**
 * @author Qidong Ding
 * @description TODO：
 * @date 2022-03-15-11:56
 * @since JDK 1.8
 */

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
       return data.length - 1;
    }

    /**
     * 获取队列的大小
     *
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 将一个元素 入队
     *
     * @param e
     * @return
     */
    @Override
    public void enqueue(E e) {
        if ((tail + 1 ) % data.length == front) {
            resize(2 * getCapacity());
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 将队首的元素 出队
     *
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    /**
     * 获取队首的 元素
     *
     * @return
     */
    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }
        return data[front];
    }

    private void resize(int capacity) {
        E[] newdata = (E[]) new Object[capacity + 1];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[(i + front) % data.length];
        }
        data = newdata;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array：size = %d, capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for (int i = front; i != tail; i = (i +1 ) % data.length) {
            res.append(data[i]);
            if ((i +1) % data.length != tail) {
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }


    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
