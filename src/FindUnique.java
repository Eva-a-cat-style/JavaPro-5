import java.util.ArrayList;
import java.util.List;

    public class FindUnique {
        public static List<String> findUnique(List<String> list) {
            List<String> unique = new ArrayList<>();
            for (String animals : list) {
                if (!unique.contains(animals)) {
                    unique.add(animals);
                }
            }
            return unique;
        }
    }

