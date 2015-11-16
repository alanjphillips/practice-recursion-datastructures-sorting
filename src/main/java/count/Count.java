package count;


public class Count {

    public static int count7(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must greater than or equal to Zero");
        }

        if (n / 10 == 0) {
            if (n % 10 == 7) return 1;
            else return 0;
        }

        int amt = 0;
        if (n % 10 == 7) amt = 1;

        return amt + count7(n / 10);
    }


    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        if (str.length() == 1) {
            if (str.charAt(0) == 'x') return 1;
            else return 0;
        }

        int amt;
        if (str.charAt(0) == 'x') amt = 1;
        else amt = 0;

        return amt + countX(str.substring(1));
    }

    public static int countAbc(String str) {

        if (str.length() <= 2) {
            return 0;
        }

        int amt = 0;
        int advance = 1;
        String strToCheck = str.substring(0, 3);
        if (strToCheck.equals("abc")) {
            amt = 1;
            advance = 3;
        } else if (strToCheck.equals("aba")) {
            amt = 1;
            advance = 2;
        }

        return amt + countAbc(str.substring(advance));
    }

    public static int countHi2(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return 0;
        }

        int amt = 0;
        int advance = 1;
        String strToCheck = str.substring(strLength - 2, strLength);
        if (strToCheck.equals("hi")) {
            if (strLength > 2 && str.charAt(strLength - 3) == 'x') {
                advance = 3;
            } else {
                advance = 2;
                amt = 1;
            }
        }

        return amt + countHi2(str.substring(0, strLength - advance));
    }


    public static int strCount(String str, String sub) {
        if (sub.isEmpty()) {
            throw new IllegalArgumentException("Empty substring not allowed");
        }

        if (str.length() < sub.length()) {
            return 0;
        }

        int amt = 0;
        int advance = 1;
        if (str.substring(0, sub.length()).equals(sub)) {
            amt = 1;
            advance = sub.length();
        }

        return amt + strCount(str.substring(advance), sub);
    }


}
