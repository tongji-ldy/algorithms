package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        int index = str.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            Integer value = map.get(chars[i]);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            map.put(chars[i], count);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) == 1 && index > str.indexOf(c)) {
                index = str.indexOf(c);
            }
        }

        return index == str.length() ? -1 : index;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar fnrc = new FirstNotRepeatingChar();
        System.out.println(fnrc.FirstNotRepeatingChar("aagooglee"));
    }
}
