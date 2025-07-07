package basics.arrayCodes;

public class FindTheSecondLargestAndSecondSmallestElement {
    // Find the second largest and second smallest element

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int secondMax =0;
    static int secondMin = 0;

    public static void findSecondLargestAndSecondSmallest(int[] arr) {
       for(int i=0;i < arr.length;i++)
       {
           if(max < arr[i])
           {
               secondMax = max;
               max = arr[i];
           } else if (secondMax < arr[i] && arr[i] !=max) {
                secondMax = arr[i];
           }


              if(min > arr[i])
              {
                secondMin = min;
                min = arr[i];
              } else if (secondMin > arr[i] && arr[i] != min) {
                 secondMin = arr[i];
              }
       }
        System.out.println("Second Largest: " + secondMax);
        System.out.println("Second Smallest: " + secondMin);
    }

}
