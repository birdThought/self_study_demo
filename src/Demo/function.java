package Demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author: cp
 * @version: 1.0
 * @Description TODO
 * @Date 2020/11/21 11:05
 */
public class function {
    public static void main(String[] args) {
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println();
        solution(list,message -> System.out.println("Hello " + message));
    }

    private static void solution(List<Integer> list,  GreetingService greetService1) {
            for (Integer n : list){
                greetService1.sayMessage(n+"");
            }
    }


}
