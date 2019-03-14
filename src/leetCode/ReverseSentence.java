package leetCode;

public class ReverseSentence {
//    public String ReverseSentence(String str) {
//        String[] strs = str.split(" ");
//        if (strs.length <= 1) return str;
//        StringBuilder result = new StringBuilder();
//        StringBuilder sb = null;
//        for (int i = 0; i < strs.length; i++) {
//            sb = new StringBuilder(strs[i]);
//            sb.reverse();
//            result.append(sb);
//            if (i != strs.length - 1) result.append(" ");
//        }
//        return result.reverse().toString();
//    }

    public String ReverseSentence(String str) {
        String[] strs = str.split(" ");
        if (strs.length <= 1) return str;
        StringBuilder result = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            result.append(strs[i]);
            if (i != 0) result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReverseSentence rs = new ReverseSentence();
        System.out.println(rs.ReverseSentence("student a am i"));
    }
}
