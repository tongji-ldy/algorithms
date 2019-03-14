package compExam.pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

//public class BigIntMuti {
//    public String bigIntMuti(String bi1, String bi2) {
//        int[] bi1Array = new int[bi1.length()];
//        int[] bi2Array = new int[bi2.length()];
//        for (int i = 0; i < bi1.length(); i++) {
//            bi1Array[i] = Integer.parseInt(bi1.charAt(bi1.length() - 1 - i) + "");
//        }
//        for (int i = 0; i < bi2.length(); i++) {
//            bi2Array[i] = Integer.parseInt(bi2.charAt(bi2.length() - 1 - i) + "");
//        }
//
//        int carry = 0;
//        int value = 0;
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < bi2Array.length; i++) {
//            ArrayList<Integer> result1 = new ArrayList<>();
//            for (int k = 0; k < i; k++) {
//                result1.add(0);
//            }
//            for (int j = 0; j < bi1Array.length; j++) {
//                value = bi2Array[i] * bi1Array[j] + carry;
//                if (value > 9) {
//                    carry = value / 10;
//                    value = value % 10;
//                } else {
//                    carry = 0;
//                }
//                result1.add(value);
//                if (j == bi1Array.length - 1 && carry != 0) {
//                    result1.add(carry);
//                }
//            }
//            result.add(result1);
//            carry = 0;
//            for (int m : result1) {
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//
//        carry = 0;
//        value = 0;
//        StringBuilder answer = new StringBuilder();
//        for (int i = 0; i < result.get(result.size() - 1).size(); i++) {
//            for (ArrayList<Integer> al : result) {
//                if (i > al.size() - 1) continue;
//                value += al.get(i);
//            }
//            value += carry;
//            if (value > 9) {
//                carry = value / 10;
//                value = value % 10;
//            } else carry = 0;
//            answer.append(value);
//            value = 0;
//        }
//        if (carry != 0) {
//            answer.append(carry);
//        }
//
//        return answer.reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String bi1 = null;
//        String bi2 = null;
//        if (in.hasNext()) {
//            bi1 = in.next();
//            bi2 = in.next();
//        }
//        BigIntMuti bim = new BigIntMuti();
//        System.out.println(bim.bigIntMuti(bi1, bi2));
//    }
//}

public class BigIntMuti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        // even 99 * 99 is < 10000, so maximaly 4 digits
        int[] d = new int[num1.length() + num2.length()];
        for (int i = 0; i < num1.length(); i++) {
            int a = num1.charAt(i) - '0';
            for (int j = 0; j < num2.length(); j++) {
                int b = num2.charAt(j) - '0';
                d[i + j] += a * b;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d.length; i++) {
            int digit = d[i] % 10;
            int carry = d[i] / 10;
            sb.insert(0, digit);
            if (i < d.length - 1)
                d[i + 1] += carry;
        }
        //trim starting zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
