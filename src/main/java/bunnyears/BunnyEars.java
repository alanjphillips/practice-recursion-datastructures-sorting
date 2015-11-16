package bunnyears;


public class BunnyEars {

    public static int bunnyEars(int bunnies) {
        if (bunnies < 0) {
            throw new IllegalArgumentException("Must be greater than Zero");
        }

        if (bunnies == 0) {
            return 0;
        }

        return 2 + bunnyEars(--bunnies);
    }
}
