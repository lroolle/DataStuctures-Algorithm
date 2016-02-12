package Chapter1_Introduction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class GenericMemoryCellTest {
    private GenericMemoryCell<Integer> genericMemoryCell;

    @Before
    public void setUp() throws Exception {
        genericMemoryCell = new GenericMemoryCell<>(); //Diamond operator
    }

    @Test
    public void testRead() throws Exception {
        genericMemoryCell.write(100);
        assertEquals(100, (int) genericMemoryCell.read());
        // 自动装/拆箱
    }
}