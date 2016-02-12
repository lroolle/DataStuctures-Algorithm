package Chapter2_AlgorithmAnalysis;

/**
 * Greatest common divisor
 *
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class Gcd {

    /**
     * Euclid's algorithm
     *
     * @param m long
     * @param n long
     * @return gcd
     */
    public static long gcd(long m, long n){

        while(n != 0){

            long rem = m%n;
            m = n;
            n = rem;
        }
        return m;
    }
}
