package function;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author cp
 * @CreateDate 2021/1/5
 * @Email soul_thought@163.com
 */
public class Function1 {
    public static  void main(String[] args) {
        Stream<String> names = Stream.of("Lamurudu", "Okanbi", "Oduduwa");

        Optional<String> longest = names

                .filter(name -> name.startsWith("L"))

                .findFirst();

        longest.ifPresent(name -> {

            String s = name.toUpperCase();

            System.out.println("The longest name is "+ s);

        });
    }
}
