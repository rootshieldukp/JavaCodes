package basics.characterCode;

import java.util.HashMap;
import java.util.Map;

public class FrequentCharacterInAString {

    // most frequent character in a string

    public static void printMostFrequentCharacter(String str) {

        char[] charArr = str.toCharArray();
        Map<Character, Integer> map= new HashMap<>();

        for(char ch : charArr)
        {
            if(ch != ' ')
            {
                map.put(ch, map.getOrDefault(ch,0)+1)

            }
        }




    }
}
