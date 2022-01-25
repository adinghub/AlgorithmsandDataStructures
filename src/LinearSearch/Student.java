package LinearSearch;

/**
 * @author Qidong Ding
 * @description TODO：线性查找作业：设计一个Student类
 * @date 2022-01-25-20:32
 * @since JDK 1.8
 */

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    /**
     * 重写 equals 方法
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // 如果 传入的 对象为当前对象则直接返回true
        if (this == object) {
            return true;
        }
        // 如果 传入的对象 为 null 则直接返回false
        if (object == null) {
            return false;
        }
        // 如果 传入的对象 不属于同一个类对象 则直接返回 fasle
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Student student = (Student) object;
        return this.name.equals(student.name);
    }

}
