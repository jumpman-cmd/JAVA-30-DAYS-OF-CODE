import java.util.*;
import java.io.*;

class Main 
{
    public static String ArrayChallenge(String[] strArr) 
    {    
        LinkedHashSet<String> cache = new LinkedHashSet<>(5);

        for (String element : strArr) 
        {
            if (cache.contains(element)) 
            {
                cache.remove(element);
            }

            cache.add(element);

            if (cache.size() > 5)
            {
                Iterator<String> iterator = cache.iterator();
                iterator.next(); 
                iterator.remove(); 
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (String cacheElement : cache) 
        {
            result.append(cacheElement).append("-");
        }

        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine().split(", ")));
    }
}
