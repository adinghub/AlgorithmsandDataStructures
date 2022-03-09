package LinearSearch;

/**
 * @author Qidong Ding
 * @description TODO：数组生成器
 * @date 2022-03-09-21:41
 * @since JDK 1.8
 */

public class ArrayGenerator {

    // 构造方法私有化
    private ArrayGenerator() {
    }

    /**
     * 生成一个有序数组
     *
     * @param size 数组大小
     * @return 数组
     */
    public static Integer[] generorterOrderedArray(int size) {
        // 开辟一个大小为 size 的数组
        Integer[] arr = new Integer[size];

        // 循环赋值
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        // 返回
        return arr;
    }

}
