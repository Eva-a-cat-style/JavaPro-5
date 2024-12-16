import phonebook.Record;
import phonebook.TelephoneBook;
import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<String> words = List.of("Money", "Cat", "Cat", "Mushrooms",
                    "Black", "Coffee", "Coffee", "Money", "Cat", "Coffee",
                    "Hamburg", "Couch", "Cat");

            Integer[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Array: " + Arrays.toString(arr));
            List<Integer> list = ToList.arrayToList(arr);
            System.out.println("List: " + list);
            System.out.println();

            List<String> animals = List.of("Coat","Cow","Coat","Cat","Cow",
                    "Cow","Cow","Cow", "Dog","Mouse","Horse");
            System.out.println("Animals: " + animals);
            System.out.println("Find unique animals: " + FindUnique.findUnique(animals));
            System.out.println();
            System.out.println("Word occurrence: " + words);
            CalcOccurrence.calcOccurrence(words);

            List<FindOccurrence.WordOccurrence> occurrences = FindOccurrence.findCases(words);
            System.out.println("Occurrences: " + occurrences);

            TelephoneBook phoneBook = new TelephoneBook();
            phoneBook.addRecord(new Record("Masha","12345"));
            phoneBook.addRecord(new Record("Sasha","67890"));
            phoneBook.addRecord(new Record("Alex","101112"));
            phoneBook.addRecord(new Record("Masha","131415"));


            System.out.println("Find Masha" + phoneBook.find("Masha"));
            System.out.println("      ");
            System.out.println("Find all Masha's" + phoneBook.findAll("Masha"));



        }

    }

