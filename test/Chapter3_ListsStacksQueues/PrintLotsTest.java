package Chapter3_ListsStacksQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Eric Wang
 */
public class PrintLotsTest {

    private static List<String> str = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "7", "9", "10", "11", "12"));
    private static List<Integer> pos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9, 10, 11, 12));

    public static void main(String [] args) {
        PrintLots.printLots(str, pos);
    }
}