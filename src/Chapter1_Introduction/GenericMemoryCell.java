package Chapter1_Introduction;

/**
 * Comparable interface
 * Java 7 Diamond Operator
 * GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
 * Which simplifies the code
 * @author Eric Wang <wrqatw@gmail.com>.
 */

public class GenericMemoryCell<AnyType> {

    public AnyType read(){ return storedValue;}

    public void write(AnyType x){ storedValue = x;}

    private AnyType storedValue;

}
