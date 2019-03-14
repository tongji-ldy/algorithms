package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        List<String> resultList = new ArrayList<>();
        if (str.length() == 0)
            return (ArrayList) resultList;
        fun(str.toCharArray(), resultList, 0);
        Collections.sort(resultList);
        return (ArrayList) resultList;
    }

    private void fun(char[] ch, List<String> list, int i) {
        if (i == ch.length - 1) {
            if (!list.contains(new String(ch))) {
                list.add(new String(ch));
                return;
            }
        } else {
            for (int j = i; j < ch.length; j++) {
                swap(ch, i, j);
                fun(ch, list, i + 1);
                swap(ch, i, j);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        if (i != j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
}