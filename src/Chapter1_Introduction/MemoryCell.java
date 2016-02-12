package Chapter1_Introduction;

/**
 * Superclass Object for Genericity
 *
 * @author Eric <wrqatw@gmail.com>.
 */


public class MemoryCell {

    private Object storedValue;
    public Object read(){ return storedValue;}
    public void write(Object x){ storedValue = x;}

}
