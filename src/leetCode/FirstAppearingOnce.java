package leetCode;

import java.util.HashMap;

public class FirstAppearingOnce {
    private StringBuilder sb = new StringBuilder();
    private HashMap<Character, Integer> hm = new HashMap<>();

    public void Insert(char ch) {
        sb.append(ch);

        Integer value = hm.get(ch);
        int count = 1;
        if (value != null) {
            count = value + 1;
        }
        hm.put(ch, count);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (hm.get(chars[i]) == 1) return chars[i];
        }
        return '#';
    }

    public static void main(String[] args) {
        FirstAppearingOnce fao = new FirstAppearingOnce();
        fao.Insert('g');
        fao.Insert('o');
        fao.Insert('o');
        fao.Insert('g');
        fao.Insert('e');
        fao.Insert('e');
        System.out.println(fao.FirstAppearingOnce());
    }
}
