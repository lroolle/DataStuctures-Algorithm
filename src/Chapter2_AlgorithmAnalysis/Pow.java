package Chapter2_AlgorithmAnalysis;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class Pow {

    public static long pow(long x, long n) {

        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        if(isEven(n))
            return pow(x*x, n / 2);
        else
            return pow(x*x, n / 2)*x;
    }

    private static boolean isEven(long n) {
        return n % 2 == 0;
    }

}
