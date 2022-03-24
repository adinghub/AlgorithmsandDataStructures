package recursion;

/**
 * @author Qidong Ding
 * @description TODO：数组求和
 * @date 2022-03-24-20:12
 * @since JDK 1.8
 */

public class SumArry {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 计算 arr[l……n] 这个区间的所有数字的和
     * @param arr
     * @param i
     * @return
     */
    private static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(nums));
    }
}
