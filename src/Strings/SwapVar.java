package Strings;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class SwapVar {

    public static void xorSwap(int a, int b){

        System.out.println("a = "+a+"\nb = "+b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = "+a+"\nb = "+b);
    }


    public static void minusSwap(int a, int b){

        System.out.println("a = "+a+"\nb = "+b);
        a -= b;
        b += a;
        a = b-a;
        System.out.println("a = "+a+"\nb = "+b);
    }

    public static void main(String [] args){
        int a = 1;
        int b = 2;
        xorSwap(a, b);
        minusSwap(a, b);
    }
}
