import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    /**
     * counts the number of unique strings in a list
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
    public static int countUnique(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Set<String> unique = new HashSet<>(list);
        return unique.size();
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");

        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}