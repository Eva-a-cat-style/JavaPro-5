
import java.util.ArrayList;
import java.util.List;

    public class FindOccurrence {
        public static class WordOccurrence {
            String name;
            int count;

            public WordOccurrence(String name, int count) {
                this.name = name;
                this.count = count;
            }

            @Override
            public String toString() {
                return "name: \"" + name + "\", count: " + count;
            }
        }

        public static List<WordOccurrence> findCases(List<String> list) {
            List<WordOccurrence> occurrences = new ArrayList<>();

            for (String word : list) {
                boolean found = false;
                for (WordOccurrence occurrence : occurrences) {
                    if (occurrence.name.equals(word)) {
                        occurrence.count++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    occurrences.add(new WordOccurrence(word, 1));
                }
            }
            return occurrences;
        }
    }


