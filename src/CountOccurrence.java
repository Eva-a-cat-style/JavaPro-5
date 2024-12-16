
import java.util.List;

    public class CountOccurrence {
        public static int countOccurrence(List<String> list, String word) {
            int count = 0;
            for (String str : list) {
                if (str.equals(word)) {
                    count++;
                }
            }
            return count;
        }
    }
    

