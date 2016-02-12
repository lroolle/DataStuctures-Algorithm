package Chapter2_AlgorithmAnalysis;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class ProbrRelPrim {
    /**
     *
     * @param n int
     * @return probability, when n -> infinity probability -> 6/π^2
     */
    public static double probRelprim(int n) {

        int rel = 0, tot = 0;

        for (int i = 1; i <= n; i++)
            for (int j = i + 1; j<= n; j++){

                tot++;
                if (Gcd.gcd(i, j) == 1)
                    rel++;
            }
        return (double) rel / tot;
    }
}
