package Array;

/**
 * @author Qidong Ding
 * @description TODO： 数组
 * @date 2022-03-13-20:50
 * @since JDK 1.8
 */

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造函数，传入数组ude容量 capacity 构造 Array
     *
     * @param capacity 数组的容量
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造，默认创建长度为 10  的 Array
     */
    public Array() {
        data = (E[])new Object[10];
    }

    /**
     * 获取数组中元素的个数
     *
     * @return 返回数组中元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的长度
     *
     * @return 返回数组的长度
     */
    public int getCapactity() {
        return data.length;
    }

    /**
     * 数组是否有元素
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 像数组最后添加一个元素
     *
     * @param e 添加的元素
     */
    public void addLast(E e) {
        add(size,e);
    }

    /**
     * 向数组最后添加一个元素
     *
     * @param e 添加的元素
     */
    public void addFirst(E e) {
        add(0,e);
    }

    /**
     * 往数组的index位置添加一个新的元素
     * @param index 数组的位置
     * @param e 新的元素
     */
    public void add(int index,E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }

        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size-1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取数组中 Index 位置的元素
     * @param index 位置
     * @return index 位置的元素
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("getIndex() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }
        return data[index];
    }

    /**
     * 查找数组中是否存在 e
     * @param e 查找的元素
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找数组中元素 e 的索引
     * @param e  元素
     * @return 查找到返回 索引值，未查到返回 -1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取第一个元素
     * @return 返回第一个元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取最后一个元素
     * @return 返回最后一个元素
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 从数组中删除index 位置的元素
     * @param index 位置
     * @return 返回删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 2) {
            resize(data.length / 2);
        }
        return ret;
    }

    /**
     * 从数组中删除第一个元素
     * @return 返回删除
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从数组中删除最后一个元素
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 从数组中删除一个元素
     * @param e 需要删除的元素
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 将数组中 Index 位置的元素更新为 e
     * @param index 位置
     * @param e 新元素
     * @return index 位置的元素
     */
    public E set(int index,E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("getIndex() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }
        return data[index] = e;
    }



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array：size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }

    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}