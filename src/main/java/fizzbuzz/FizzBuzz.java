package fizzbuzz;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> createFizzBuzzSimple(int n) {
        List<String> fbResult = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (i % 15 == 0) {
                fbResult.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fbResult.add("Fizz");
            } else if (i % 5 == 0) {
                fbResult.add("Buzz");
            } else {
                fbResult.add(Integer.toString(i));
            }
        }
        return fbResult;
    }

    public static List<String> createFizzBuzzAlternative(int n) {
        List<String> fbResult = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            StringBuilder entry = new StringBuilder();

            if (i % 3 == 0) entry.append("Fizz");
            if (i % 5 == 0) entry.append("Buzz");
            if (entry.length() == 0) entry.append(i);

            fbResult.add(entry.toString());
        }

        return fbResult;
    }

}
