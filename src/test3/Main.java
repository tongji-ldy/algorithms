package test3;

public class Main {
    private double result = 1;

    private double cal() {
        for (int i = 0; i < 35; i++) {
            result *= ((35.0 - i) / (36.0 - i));
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("¸ÅÂÊÊÇ" + main.cal());
    }
}
