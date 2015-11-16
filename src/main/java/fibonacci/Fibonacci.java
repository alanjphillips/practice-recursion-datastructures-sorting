package fibonacci;


import java.util.*;

public class Fibonacci {

    public static List<Long> createFibList(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to Zero");
        }

        if (n == 0) {
            return Arrays.asList();
        }

        if (n == 1) {
            return Arrays.asList(0L);
        }

        if (n == 2) {
            return Arrays.asList(0L, 1L);
        }

        List<Long> fibList = new LinkedList<>();
        fibList.add(0L);
        fibList.add(1L);
        n -= 2;

        while (n >= 1) {
            long sum = fibList.get(fibList.size() - 1) + fibList.get(fibList.size() - 2);
            fibList.add(sum);
            n--;
        }

        return fibList;
    }


    public static long fibNIterative(int n) {
        List<Long> fibs = createFibList(n + 1);
        return fibs.get(fibs.size() - 1);
    }


    public static long fibN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to Zero");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibN(n - 1) + fibN(n - 2);
    }


    private Map<Integer, Long> fibCache = new HashMap<>();

    public long memoizedfibN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to Zero");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibCache.containsKey(n)){
            return fibCache.get(n);
        }

        long fibValue = memoizedfibN(n - 1) + memoizedfibN(n - 2);
        fibCache.put(n, fibValue);

        return fibValue;
    }
}
