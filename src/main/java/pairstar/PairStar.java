package pairstar;


public class PairStar {

    public static String pairStar(String str) {

        if (str.length() == 1 || str.isEmpty()) {
            return str;
        }

        String pairResult;
        if (str.charAt(0) == str.charAt(1)) {
            pairResult = String.valueOf(str.charAt(0)) + "*";
        } else {
            pairResult = String.valueOf(str.charAt(0));
        }

        return pairResult + pairStar(str.substring(1));

    }

}
