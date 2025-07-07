package basics.arrayCodes;

public class FindMaxAndMinInAnArray {

    public static void getMaximumAndMinimumNumberInArray(int[] int_arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Initial Max & Min Values: " + max + " " + min);

        for(int num: int_arr)
        {
            if(num > max)
            {
                max = num;
            }
            if(num < min)
            {
                min = num;
            }
        }

        System.out.println("Maximum Number in Array: " + max);
        System.out.println("Minimum Number in Array: " + min);



    }

}
