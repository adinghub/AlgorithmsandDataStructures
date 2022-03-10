package SelectionSort;

/**
 * @author Qidong Ding
 * @description TODO：选择排序
 * @date 2022-03-09-22:34
 * @since JDK 1.8
 */

public class SelectionSort {

    /**
     * 构造方法私有化
     */
    private SelectionSort() {

    }

    /**
     * 选择排序方法
     * @param arr 数组
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中最小值的 索引，默认为 第一个开始,也就是 i
            int minIndex = i;
            // 循环整个数组
            for (int j = i; j < arr.length; j++) {
                // 判断 当前数据的值 如果 小于 当前最小值 就把当前数据的索引给minIndex
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    // 把当前 的索引给最小值
                    minIndex = j;
                }
            }
            // 交换位置
            swap(arr, minIndex, i);
        }

    }

    /**
     * 交换位置
     * @param arr 需要交换的数组
     * @param minIndex 最小值 索引
     * @param i 查找到的 索引
     * @param <E> 泛型
     */
    private static <E>  void swap(E[] arr, int minIndex, int i) {
        E temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
