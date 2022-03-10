package InsertionSort;


import SortUilts.ArrayGenerator;
import SortUilts.SortingHelper;

/**
 * @author Qidong Ding
 * @description TODO： 插入排序
 * @date 2022-03-10-20:37
 * @since JDK 1.8
 */

public class InsertSort {

    /**
     * 构造方法私有化
     */
    private InsertSort() {

    }

    /**
     * 插入排序
     * @param arr 排序的数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void  sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 将 arr[i] 插入到 合适的位置
//            for (int j = i; j - 1 > 0; j--) {
//                // 判断 当前索引的 元素 是否 比前一个元素小，小就交换，否则处理下个元素
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }

            // 简化代码
            for (int j = i; j -1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr,j,j-1);
            }
        }
    }

    /**
     * 插入排序-优化
     * @param arr 排序的数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void  sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 将 arr[i] 插入到 合适的位置
            E t = arr[i]; // 暂存 当前元素
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }
    
    
    
    /**
     * 交换位置
     * @param arr 需要交换的数组
     * @param j 数组的索引
     * @param i 数组的索引
     * @param <E> 泛型
     */
    private static <E>  void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] data = {10000, 100000};
        for (int i = 0; i < data.length; i++) {
            Integer[] randomArray = ArrayGenerator.generateRandomArray(data[i], data[i]);
            Integer[] randomArray2 = ArrayGenerator.generateRandomArray(data[i], data[i]);
            SortingHelper.sortTest("InsertSort",randomArray);
            SortingHelper.sortTest("InsertSort2",randomArray2);
        }

    }
}
