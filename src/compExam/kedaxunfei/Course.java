package compExam.kedaxunfei;

import java.util.*;

public class Course {
    public int time;
    public int code;

    public Course(int time, int code) {
        this.time = time;
        this.code = code;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> al = new ArrayList<>();
        Course c = null;
        int courseNum = sc.nextInt();

        for (int i = 0; i < courseNum; i++) {
            c = new Course(Integer.valueOf(sc.next()), Integer.valueOf(sc.next()));
            al.add(c);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Course course : al) {
            int count = 1;
            Integer value = hm.get(course.time);
            if (value != null) {
                count += value;
                if (!minHeap.contains(course.time)) minHeap.add(course.time);
            }
            hm.put(course.time, count);
        }
        if (minHeap.isEmpty()) System.out.println("YES");

        while (!minHeap.isEmpty()) {
            int time = minHeap.poll();
            int num = hm.get(time);
            System.out.print(time + " ");
            for (Course course : al) {
                if (course.time == time) {
                    num--;
                    if (num != 0) System.out.print(course.code + " ");
                    else System.out.print(course.code);
                }
            }
            System.out.println();
        }
    }

}
