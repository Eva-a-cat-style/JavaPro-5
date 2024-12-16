import java.util.Arrays;
import java.util.List;

public class ToList {
    public static <T> List <T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }
}


