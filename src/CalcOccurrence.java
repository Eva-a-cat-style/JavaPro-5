import java.util.ArrayList;
import java.util.List;

public class CalcOccurrence {

    public static void calcOccurrence(List<String> list) {
            List<String> words = new ArrayList<>();
            List<Integer> counts = new ArrayList<>();

            for(String word : list) {
                if(words.contains(word)) {
                    int index = words.indexOf(word);
                    counts.add(index, counts.get(index) + 1);
                } else {
                    words.add(word);
                    counts.add(1);
                }
            }
            for(int i = 0; i < words.size(); i++) {
                System.out.println(words.get(i) + " " + counts.get(i));
            }
        }
    }

