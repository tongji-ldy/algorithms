package meituan;

public class Test {
    //private Test test = new Test();

    static {
        System.out.println("��̬��");
    }

    {
        System.out.println("�����");
    }

    public Test() {
        System.out.println("������");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}

