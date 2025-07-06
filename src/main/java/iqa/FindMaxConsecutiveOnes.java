package iqa;

public class FindMaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {


        int maxcount = 0;
        int count=0;

        for(int i=0;i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;
                if(count > maxcount)
                {
                    maxcount = count;
                }
            }
            else
            {


                count = 0;
            }

        }

        return maxcount;
    }
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int maxCount = 0;
//        int currentCount = 0;
//
//        for (int num : nums) {
//            if (num == 1) {
//                currentCount++;
//            } else {
//                maxCount = Math.max(maxCount, currentCount);
//                currentCount = 0;
//            }
//        }
//
//        // Final check in case the array ends with a sequence of 1s
//        maxCount = Math.max(maxCount, currentCount);
//
//        return maxCount;
//    }
}
