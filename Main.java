/*
Challenge Description

Goal: Given a comma-separated string of elements, the task is to identify and return the last five unique elements in 
the order they were last encountered.

    Input: The program reads a single line of input, which is a string containing elements separated by commas. 
    For example: "apple, banana, apple, orange, mango, banana, kiwi".

    Using a LinkedHashSet:
        The LinkedHashSet is used to maintain the order of insertion while ensuring that each element is unique. 
        It can hold up to five elements as specified by the challenge.

    Processing the Input:
        The program iterates over each element in the input array (strArr).
        If the element already exists in the cache (LinkedHashSet), it is removed and then added again to update its position 
        as the most recently seen element.
        If adding the new element causes the size of the cache to exceed five, the oldest element (the first one added) 
        is removed using an iterator.

    Building the Result:
        After processing all elements, the program constructs a result string by appending each element in the cache, 
        separated by hyphens (-).
        The final string is returned without the trailing hyphen.

    Output: The program prints the final result to the console.

Example Input/Output

    Input: "apple, banana, apple, orange, mango, banana, kiwi"
    Output: "orange-mango-banana-kiwi"
*/

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
