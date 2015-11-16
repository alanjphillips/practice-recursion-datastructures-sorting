package reversestring;


public class ReverseString {

    public static String reverseWithStringBuilderInPlace(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() / 2; i++) {
            char front = sb.charAt(i);
            char back = sb.charAt(sb.length() - 1 - i);
            sb.setCharAt(i, back);
            sb.setCharAt(sb.length() - 1 - i, front);
        }

        return sb.toString();
    }

    public static String reverse(String s) {

        if (s.length() == 1) return s;

        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

}
