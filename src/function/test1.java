package function;

import java.awt.*;
import java.util.function.Consumer;

/**
 * @author: cp
 * @version: 1.0
 * @Description TODO
 * @Date 2020/11/21 15:58
 */
public class test1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        Consumer<StringBuilder>  cp = str -> str.append("cp");
        cp.accept(s);

        Consumer<StringBuilder> consumer1 = (str) -> str.append(" Bob!");
        cp.andThen(consumer1).accept(s);

        System.out.println(s);
    }
}
