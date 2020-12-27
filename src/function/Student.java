package function;

/**
 * @author: cp
 * @version: 1.0
 * @Description TODO
 * @Date 2020/11/22 17:46
 */
public class Student {
    private String name;
    private Integer stature;
    private Integer age;


    public Student(String name, Integer stature, Integer age) {
        this.name = name;
        this.stature = stature;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStature() {
        return stature;
    }

    public void setStature(Integer stature) {
        this.stature = stature;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
