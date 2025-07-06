package utilities;

public class SubStringUtility {

    // With SubString
    public static String getSubStringWithFunction(String str, int start, int end) {
        if (str == null || start < 0 || end > str.length() || start >= end) {
            throw new IllegalArgumentException("Invalid parameters for substring extraction.");
        }
        return str.substring(start, end);
    }


    public static String getSubStringWithoutFunction(String str, int start, int end) {
        if (str == null || start < 0 || end > str.length() || start >= end) {
            throw new IllegalArgumentException("Invalid parameters for substring extraction.");
        }

        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }
        return subStr.toString();
    }



}
