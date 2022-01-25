package LinearSearch;

/**
 * @author Qidong Ding
 * @description TODO： 线性查找指按一定的顺序检查数组中每一个元素，直到找到所要寻找的特定值或检查完数组为止。
 * @date 2022-01-25-19:56
 * @since JDK 1.8
 */

public class LinearSearch {

    /**
     * 线性查找实现方法
     * @param data 被查找的数据
     * @param target 需要查找的数据
     * @return 找到返回 1 未找到则返回 -1
     */
    public static <T> int search(T[] data, T target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // 定义数组
        Integer[] data = {28, 18, 12, 9, 16, 66, 32, 4};

        // 查找到的情况
        int result = LinearSearch.search(data, 16);
        System.out.println(result);
        
        // 未查到的情况
        int result1 = LinearSearch.search(data, 25);
        System.out.println(result1);

        // 自定义数据测试
        Student[] students = {new Student("张三"),
                              new Student("李四"),
                              new Student("王五")};

        Student zhangsan = new Student("王五");
        int search = LinearSearch.search(students, zhangsan);
        System.out.println(search);
    }
}
