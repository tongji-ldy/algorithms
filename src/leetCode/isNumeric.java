package leetCode;

public class isNumeric {
    public boolean isNumeric(char[] str) {
        String s = String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.)?[0-9]+([eE][+-]?[0-9]+)?");
    }

    public static void main(String[] args) {
        isNumeric in = new isNumeric();
        char[] str = {'1', '+', '2', '3'};
        System.out.println(in.isNumeric(str));
    }
}
