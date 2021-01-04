package Demo;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author cp
 * @CreateDate 2021/1/4
 * @Email soul_thought@163.com
 */
public class Sort1 {
    public static void main(String[] args) {
        Integer[] a = { 9, 8, 7, 2, 3, 4, 1, 0, 6, 5 };    // 数组类型为Integer
        Arrays.sort(a, Collections.reverseOrder());
        for (int arr : a) {
            System.out.print(arr + " ");
        }
    }
}
