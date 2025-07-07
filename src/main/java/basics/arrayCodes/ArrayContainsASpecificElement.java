package basics.arrayCodes;

public class ArrayContainsASpecificElement {

    // Check if an array contains a specific element

    public static boolean containsElementInIntegerArray(int[] arr, int element) {

        for(int num : arr){
            if(num == element)
            {
                return true;
            }
        }

        return false;
        }

    public static boolean containsElementInStringArray(String[] arr, String element) {
        for(String str : arr){
            if(str.equals(element))
            {
                return true;
            }
        }

        return false;
    }
}
