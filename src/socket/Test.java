package socket;

import java.net.URL;

public class Test {
    public static void main(String[] args) {
        try {
            URL baidu = new URL("http://www.baidu.com");
            System.out.println(baidu.getHost());
            System.out.println(baidu.getProtocol());
            System.out.println(baidu.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
