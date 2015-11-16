package count8;


public class Count8 {

    public static int count8(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Must be 0 or greater");
        }

        if (n == 0) {
            return 0;
        }

        int amt = 0;
        int div = n / 10;
        if (n % 100 == 88) {
            amt = 2;
        }
        else if (n % 10 == 8) {
            amt = 1;
        }

        return amt + count8(div);
    }

}
