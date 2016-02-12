package Chapter1_Introduction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class MemoryCellTest {
    private MemoryCell memoryCell;

    @Before
    public void setUp() throws Exception {
        memoryCell = new MemoryCell();
    }

    @Test
    public void testReadString() throws Exception {
        String expected = "100";
        memoryCell.write("100");
        String val = (String) memoryCell.read();
        assertEquals(expected, val);
    }


    @Test
    public void testReadInt() throws Exception {
        int expected = 100;
        memoryCell.write(100);
        int val = (int) memoryCell.read();
        assertEquals(expected, val);
    }

    @Test
    public void testReadInteger() throws Exception {
        Integer expected = new Integer(100);
        memoryCell.write(new Integer(100));
        Integer val = (Integer) memoryCell.read();
        assertEquals(expected, val);
    }
}