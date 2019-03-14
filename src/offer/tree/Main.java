package offer.tree;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] schar = s.toCharArray();
        if (schar.length == 1) {
            if (schar[0] >= 'A' && schar[0] <= 'Z') schar[0] += 32;
            System.out.println(schar[0]);
        } else {
            ArrayList<Character> al = new ArrayList<>();
            HashMap<Character, Integer> hm = new HashMap<>();

            for (int i = 0; i < schar.length; i++) {
                if (schar[i] >= 'A' && schar[i] <= 'Z') schar[i] += 32;
                if (hm.containsKey(schar[i])) {
                    int index = hm.get(schar[i]);
                    if (schar[index] > schar[index + 1]) {
                        al.remove(index);
                    }
                }
                al.add(schar[i]);
                hm.put(schar[i], i);
            }
            System.out.println(al.get(0));
        }
    }
}