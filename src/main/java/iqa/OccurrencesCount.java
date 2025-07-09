package iqa;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesCount {


    // Count occurrences of a substring in a string


    // Count occurrences of an alphabet in a string

    // Count occurrences of a word in a string
    public static void printWordOccurrences(String str)
    {
        String[] str_arr = str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for(String word: str_arr)
        {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> map : wordCountMap.entrySet())
        {
            System.out.println(map.getKey() + " : " + map.getValue());
        }


    }


}
