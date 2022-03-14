package Stack;

/**
 * @author Qidong Ding
 * @description TODO：
 * @date 2022-03-14-22:24
 * @since JDK 1.8
 */

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
