package function;

import java.util.function.Function;

/**
 * @author: cp
 * @version: 1.0
 * @Description TODO
 * @Date 2020/11/21 18:03
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> function = f -> 2 + 1;
        Function<Student, String> function1 = Student::getName;
        System.out.println(function.apply(1));
    }
}
