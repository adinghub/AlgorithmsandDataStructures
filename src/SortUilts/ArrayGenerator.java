package SortUilts;

import java.util.Random;

/**
 * @author Qidong Ding
 * @description TODO： 生成数组
 * @date 2022-03-10-19:52
 * @since JDK 1.8
 */

public class ArrayGenerator {

    /**
     * 构造方法私有化
     */
    private ArrayGenerator() {

    }

    /**
     * 生成一个长度为 size 的随机数组，每个数字的范围是 0-bound
     * @param size 数组的大小
     * @param bound 随机的范围最大值
     * @return 生成好的数组
     */
    public static Integer[] generateRandomArray(int size,int bound) {
        Integer[] arr = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
