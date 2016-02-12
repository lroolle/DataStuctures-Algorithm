package Chapter1_Introduction;

/**
 * Exercise 1.5
 *
 * Write a recursive method that returns the number of 1’s in the binary representation
 * of N. Use the fact that this is equal to the number of 1’s in the representation of
 * N/2, plus 1, if N is odd.
 *
 */
public class Ones {

    public static int ones(int n){

        if(n < 2){
            return n;
        }

        return n % 2 + ones(n / 2);
    }
}


