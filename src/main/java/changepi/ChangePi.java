package changepi;


public class ChangePi {

    public static String changePi(String str) {

        if (str.length() <= 2) {
            if (str.startsWith("pi")) return "3.14";
            else return str;
        }

        String replaced;
        int jump;
        if (str.startsWith("pi")) {
            replaced = "3.14";
            jump = 2;
        } else {
            replaced = str.substring(0, 1);
            jump = 1;
        }

        return replaced + changePi(str.substring(jump));
    }

}
