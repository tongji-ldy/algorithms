package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    Calendar c = Calendar.getInstance(TimeZone./*getDefault()*/getTimeZone("GMT"));//根据时区得到日期
    int dayOfYear = c.get(Calendar.DAY_OF_YEAR);//模拟时在一年中的天数
    int hourOfDay = c.get(Calendar.HOUR_OF_DAY);//在一天中的小时数

    private void init() {
        System.out.println("init");
    }

    private void sun() {
        System.out.println("DAY_OF_YEAR: " + dayOfYear + " | HOUR_OF_DAY: " + (hourOfDay + 8));
    }

    private void grow() {
        System.out.println("grow");
    }


    public void growSim() {
        init();
        dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        hourOfDay = c.get(Calendar.HOUR_OF_DAY);
        sun();

        String path = "C:/Users/lenovo/Desktop/nodeNum.txt";
        double nodeNum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s = br.readLine();
            nodeNum = Double.parseDouble(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        ExecutorService service = Executors.newFixedThreadPool(2);
//        service.submit(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    grow();
//                    System.out.println("haha");
//                }
//            }
//        });

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                        System.exit(0);//退出程序
//                    }
//                    grow();
//                    System.out.println("haha" + i);
//                }
//            }
//        }).start();


//        for (int i = 0; i < (int) nodeNum; i++) {
//            grow();
//        }
    }

    public static void main(String[] args) {
        Main3 m = new Main3();
        System.out.println("start");
        m.growSim();
        System.out.println("end");
    }
}
