package basics.MapCodes;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyUsingMap {

    // get map for words occurrence in a string
    public static Map<String, Integer> getMapForWordsOccurrence(String str) {
        String[] str_arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : str_arr) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }

    // Count frequency of words in a string using HashMap



    public static void printFrequencyOfWords(String str) {

        Map<String, Integer> map=getMapForWordsOccurrence(str);

        // to print using entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    // Count frequency of Alphabet in a string using HashMap


    public static void printWordWithMaximumCountInString(String str)
    {
        Map<String, Integer> map = getMapForWordsOccurrence(str);
        int maxCount = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }

        System.out.println("Word with maximum count: " + maxCount);


    }


    // Count frequency of Alphabets in a string using HashMap
    public static void printFrequencyOfAlphabets(String str) {
        char[] char_arr = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : char_arr )
        {
           if(ch != ' ') {
               map.put(ch, map.getOrDefault(ch, 0) + 1);
           }
        }

        for(Map.Entry<Character, Integer> kv : map.entrySet())
        {
            System.out.println(kv.getKey() + " : " + kv.getValue());
        }
    }

}
