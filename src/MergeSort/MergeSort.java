package MergeSort;

import SortUilts.ArrayGenerator;
import SortUilts.SortingHelper;

import java.util.Arrays;

/**
 * @author Qidong Ding
 * @description TODO： 归并排序
 * @date 2022-03-27-19:08
 * @since JDK 1.8
 */

public class MergeSort {

    // 构造私有化
    private MergeSort() {

    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length-1);
    }

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        // 如果 最左边 大于等于 最右边，即数组没有数据或者有一个数据，直接返回
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        sort(arr, l, mid); // 将左边部分的元素拆分为更小的部分
        sort(arr, mid + 1, r); // 将右边部分的元素拆分为更小的部分
        merge(arr, l, mid, r); // 进行排序
    }

    /**
     * 合并两个有序的区间: arr[l,mid] and arr[mid+1,r]
     * @param arr 数组
     * @param l 左边起始位
     * @param mid 中间位
     * @param r 右边起始位
     * @param <E> 泛型
     *
     * 因为temp是从arr截取的从第l到r位的数组，i和j是arr中第i和第j个数，对应到temp中就是第i-l和第j-l的数
     */
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        // 备份数组作为临时数组
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;

        // 每一轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {
            if (i > mid) { // 如果左半部分元素已经全部处理完毕
                arr[k] = temp[j-l]; // 将左边的元素给到 arr[k]
                j++;
            } else if (j > r) { // 如果右半部分元素已经全部处理完毕
                arr[k] = temp[i-l]; // 将右边的元素给到 arr[k]
                i++;
            } else if (temp[i-l].compareTo(temp[j-l]) <= 0) { // 左半部分所指元素 < 右半部分所指元素
                arr[k] = temp[i-l]; // 将左边的元素给到 arr[k]
                i++;
            }else { // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = temp[j-l]; // 将右边的元素给到 arr[k]
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 100000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("MergeSort",arr);
    }
}
