import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Input String
        String input = "Hello welcome to big data and big data analytics";

        // Map Phase
        String[] words = input.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            // Convert word to lowercase
            word = word.toLowerCase();

            // Count frequency of words
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Reduce Phase (Display Output)
        System.out.println("Word Count:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
