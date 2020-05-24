package huawei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static final List<Integer> test = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4));


    public static void main(String[] args) {
        System.out.println(test);
        test.set(1, 3);
        System.out.println(test);
    }
}