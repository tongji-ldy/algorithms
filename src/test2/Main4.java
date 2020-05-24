package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.TimeZone;

public class Main4 {
    Calendar c = Calendar.getInstance(TimeZone./*getDefault()*/getTimeZone("GMT"));//根据时区得到日期
    int dayOfYear = c.get(Calendar.DAY_OF_YEAR);//模拟时在一年中的天数
    int hourOfDay = c.get(Calendar.HOUR_OF_DAY);//在一天中的小时数
    int growSimCounter = 1;

    private void init() {
        System.out.println("init");
    }

    private void sun() {
        System.out.println("DAY_OF_YEAR: " + dayOfYear + " | HOUR_OF_DAY: " + (hourOfDay + 8));
    }

    private void grow() {
        System.out.println("grow");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void growSim() {
        String statusPath = "C:/Users/lenovo/Desktop/status.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(statusPath));
            String s = br.readLine();
            if (!s.equals("matlab-written")) return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        String timePath = "C:/Users/lenovo/Desktop/time.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(timePath));
            String s1 = br.readLine();
            dayOfYear = Integer.parseInt(s1);
            String s2 = br.readLine();
            hourOfDay = Integer.parseInt(s2);
            hourOfDay -= 8;
        } catch (Exception e) {
            e.printStackTrace();
        }
        sun();

        String nodeNumPath = "C:/Users/lenovo/Desktop/nodeNum.txt";
        double nodeNum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(nodeNumPath));
            String s = br.readLine();
            nodeNum = Double.parseDouble(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (growSimCounter < (int) nodeNum) {
            System.out.println(growSimCounter);
            grow();
            growSimCounter++;
        }

        String photoRatePath = "C:/Users/lenovo/Desktop/photoRate.txt";
        try {
            BufferedWriter bufw2 = new BufferedWriter(new FileWriter(photoRatePath));
            double a = 10.11;
            bufw2.write(String.valueOf(a/2));
            bufw2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bufw3 = new BufferedWriter(new FileWriter(statusPath));
            bufw3.write("groimp-written");
            bufw3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main4 m = new Main4();
        System.out.println("start");
        while (true) {
            m.growSim();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
