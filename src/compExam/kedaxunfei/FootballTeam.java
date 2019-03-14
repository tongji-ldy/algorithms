package compExam.kedaxunfei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FootballTeam {
    public String name = null;
    public int rank = 0;
    public int goalDifference = 0;
    public int goal = 0;

    public FootballTeam(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FootballTeam[]> al = new ArrayList<>();
        FootballTeam[] ft = null;
        int teamNum = 0;

        while (sc.hasNext()) {
            teamNum = Integer.valueOf(sc.nextLine());
            ft = new FootballTeam[teamNum];

            for (int i = 0; i < teamNum; i++) {
                ft[i] = new FootballTeam(sc.nextLine());
            }

            for (int i = 0; i < teamNum * (teamNum - 1) / 2; i++) {
                String[] s = sc.nextLine().split(" ");
                String[] s1 = s[0].split("-");
                String[] s2 = s[1].split(":");

                for (int j = 0; j < teamNum; j++) {
                    for (int k = 0; k < s1.length; k++) {
                        if (ft[j].name.equals(s1[k])) {
                            ft[j].goal += Integer.parseInt(s2[k]);
                            int goalDifference = (int) Math.pow(-1, k) * (Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]));
                            ft[j].goalDifference += goalDifference;
                            if (goalDifference > 0) ft[j].rank += 3;
                            if (goalDifference == 0) ft[j].rank += 1;
                            if (goalDifference < 0) ft[j].rank += 0;
                        }
                    }
                }
            }
            al.add(ft);
        }

        PriorityQueue<FootballTeam> maxHeap = new PriorityQueue<>(new Comparator<FootballTeam>() {
            @Override
            public int compare(FootballTeam f1, FootballTeam f2) {
                return Integer.valueOf(f2.rank).compareTo(Integer.valueOf(f1.rank));
            }
        });
        for (FootballTeam[] f : al) {
            for (int i = 0; i < f.length; i++) {
                maxHeap.add(f[i]);
            }
            System.out.println();
            for (int i = 0; i < teamNum / 2; i++) {
                System.out.println(maxHeap.poll().name);
            }
            maxHeap.clear();
        }

    }

}
