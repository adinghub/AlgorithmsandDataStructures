package SortUilts;

import InsertionSort.InsertSort;
import SelectionSort.SelectionSort;

/**
 * @author Qidong Ding
 * @description TODO： 辅助类
 * @date 2022-03-10-20:02
 * @since JDK 1.8
 */

public class SortingHelper {

    /**
     * 构造方法私有化
     */
    private SortingHelper() {

    }

    /**
     * 验证一个数组是否按顺序排列
     * @param arr 数组
     * @param <E> 泛型
     * @return true 按照顺序反之不是
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        // 循环判断
        for (int i = 1; i < arr.length; i++) {
            // 判断 元素是否按照顺序排列
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 排序算法 测试方法
     * @param sortName 排序类型
     * @param arr 数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void sortTest(String sortName,E[] arr) {
        // 性能测试
        long startTime = System.nanoTime();
        if (sortName.equals("SelectionSort"))
            SelectionSort.sort(arr);
        else if (sortName.equals("InsertSort"))
            InsertSort.sort(arr);
        else if (sortName.equals("InsertSort2"))
            InsertSort.sort2(arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        System.out.println(time + " s");

        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException("排序失败！");
        }
    }
}
