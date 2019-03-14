package leetCode;

public class Power {
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
