import java.util.*;
import java.io.*;

class Main {
    public static String ArrayChallenge(String[] strArr) {
        // Initialize the cache as a LinkedHashSet with a capacity of 5.
        LinkedHashSet<String> cache = new LinkedHashSet<>(5);

        for (String element : strArr) {
            // If the element is already in the cache, remove it and add it to the front.
            if (cache.contains(element)) {
                cache.remove(element);
            }

            // Add the element to the front of the cache.
            cache.add(element);

            // If the cache size exceeds 5, remove the least recently used element.
            if (cache.size() > 5) {
                Iterator<String> iterator = cache.iterator();
                iterator.next(); // Move to the least recently used element
                iterator.remove(); // Remove it
            }
        }

        // Join the elements in the cache into a string separated by hyphens.
        StringBuilder result = new StringBuilder();
        for (String cacheElement : cache) {
            result.append(cacheElement).append("-");
        }

        // Remove the trailing hyphen and return the result.
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine().split(", "))); // Split the input into an array
    }
}
