package Array;

/**
 * @author Qidong Ding
 * @description TODO： 数组测试
 * @date 2022-03-13-21:50
 * @since JDK 1.8
 */

public class ArrayTest {

    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        System.out.println(array.get(9));

        array.set(9, 88);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);
    }
}
