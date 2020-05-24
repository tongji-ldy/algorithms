package meituan;

public class Test {
    //private Test test = new Test();

    static {
        System.out.println("静态块");
    }

    {
        System.out.println("代码段");
    }

    public Test() {
        System.out.println("构造了");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}

