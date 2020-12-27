package function;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.Function;

/**
 * @author: cp
 * @version: 1.0
 * @Description TODO
 * @Date 2020/11/22 19:35
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> functionDemo = x -> x * 5;
        Integer apply = functionDemo.apply(5);
        System.out.println(apply);
    }


}
