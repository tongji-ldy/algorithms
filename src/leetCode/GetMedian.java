package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class GetMedian {
    private ArrayList<Integer> al = new ArrayList<>();

    public void Insert(Integer num) {
        al.add(num);
    }

    public Double GetMedian() {
        if (al.size() == 0) return null;
        Collections.sort(al);
        if (al.size() % 2 == 0) {
            return (double) (al.get(al.size() / 2 - 1) + al.get(al.size() / 2)) / 2;
        } else
            return (double) al.get(al.size() / 2);
    }

    public static void main(String[] args) {
        GetMedian gm = new GetMedian();
        gm.Insert(1);
        gm.Insert(2);
        gm.Insert(3);
        gm.Insert(4);
        System.out.println(gm.GetMedian());
    }
}
