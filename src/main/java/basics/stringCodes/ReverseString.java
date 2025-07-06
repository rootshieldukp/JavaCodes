package basics.stringCodes;

import java.util.Arrays;

public class ReverseString {

    public static String reverseStringWithoutInBuildFunction(String inputString)
    {
        char[] char_arr = inputString.toCharArray();
        char[] rev_arr = new char[char_arr.length];

        for(int i=0; i < char_arr.length; i++)
        {
            rev_arr[i] = char_arr[char_arr.length - 1 - i];
        }

        // First way
        StringBuffer sb = new StringBuffer();
        sb.append(rev_arr);

        return sb.toString(); //

        // Second way
        // Convert the reversed character array to a string and return it
        // return Arrays.toString(rev_arr)
        //                .replace(",", "")
        //                .replace("[", "")
        //                .replace("]", "");
    }
}
