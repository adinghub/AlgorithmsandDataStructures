package Array;

/**
 * @author Qidong Ding
 * @description TODO： 数组
 * @date 2022-03-13-20:50
 * @since JDK 1.8
 */

public class Array {

    private int[] date;
    private int size;

    /**
     * 构造函数，传入数组ude容量 capacity 构造 Array
     *
     * @param capacity 数组的容量
     */
    public Array(int capacity) {
        date = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造，默认创建长度为 10  的 Array
     */
    public Array() {
        date = new int[10];
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
        return date.length;
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
    public void addLast(int e) {
        add(size,e);
    }

    /**
     * 向数组最后添加一个元素
     *
     * @param e 添加的元素
     */
    public void addFirst(int e) {
        add(0,e);
    }

    /**
     * 往数组的index位置添加一个新的元素
     * @param index 数组的位置
     * @param e 新的元素
     */
    public void add(int index, int e) {
        if (size == date.length) {
            throw new IllegalArgumentException("add() 方法执行失败，当前数组已满");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }

        for (int i = size-1; i >= index; i--) {
            date[i + 1] = date[i];
        }
        date[index] = e;
        size++;
    }

    /**
     * 获取数组中 Index 位置的元素
     * @param index 位置
     * @return index 位置的元素
     */
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("getIndex() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }
        return date[index];
    }

    /**
     * 将数组中 Index 位置的元素更新为 e
     * @param index 位置
     * @param e 新元素
     * @return index 位置的元素
     */
    public int set(int index,int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("getIndex() 方法执行失败,index 不能小于0 或者 大于数组的长度");
        }
        return date[index] = e;
    }



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array：size = %d, capacity = %d\n", size, date.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(date[i]);
            if (i != size) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}