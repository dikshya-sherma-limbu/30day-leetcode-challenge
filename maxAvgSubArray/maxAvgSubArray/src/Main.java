public class Main {


    public static double findMaxAverage(int[] nums, int k) {
        double firstWindowSum = 0;
        double firstMaxAvg=0;
        double maxAvg=0;
        //first windows
        for(int i=0;i<k;i++){
            firstWindowSum += nums[i] ;
        }

        double maxWindowSum = firstWindowSum;
        firstMaxAvg = maxWindowSum/k;
        maxAvg=firstMaxAvg;

        if(k == nums.length ){
            maxAvg = Math.max(firstWindowSum,maxWindowSum);
            return  maxAvg/k;
        }else{
            for (int i=0; i<nums.length-k;i++){
                firstWindowSum = firstWindowSum - nums[i]+nums[i+k];
                System.out.println(firstWindowSum);
                firstMaxAvg = firstWindowSum/k;
                maxAvg = Math.max(firstMaxAvg,maxAvg);
                System.out.println("maxAvg each time " + i + " " + maxAvg);
            }
        }

        return  maxAvg;


    }
    public static void main(String[] args) {


        int nums[]={9,7,3,5,6,2,0,8,1,9};
        int  k = 6;

        System.out.println(findMaxAverage(nums,k));
    }
}