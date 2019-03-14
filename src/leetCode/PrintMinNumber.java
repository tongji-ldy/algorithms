package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<String> numList = new ArrayList<>();
        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            numList.add(numbers[i] + "");
        }

        Collections.sort(numList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);//此处调换s1与s2的位置便可以实现降序排序
            }
        });

        for (String s : numList) {
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 32, 321};
        PrintMinNumber pmn = new PrintMinNumber();
        System.out.println(pmn.PrintMinNumber(numbers));
    }
}
