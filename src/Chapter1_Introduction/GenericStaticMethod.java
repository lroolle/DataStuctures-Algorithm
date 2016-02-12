package Chapter1_Introduction;

/**
 * Generic static method
 * Search in an array
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class GenericStaticMethod<AnyType> {
    public static <AnyType> boolean contains(AnyType [] arr, AnyType x){
        for (AnyType val : arr){
            if (x.equals(val))
                return true;
        }
        return false;
    }
}
