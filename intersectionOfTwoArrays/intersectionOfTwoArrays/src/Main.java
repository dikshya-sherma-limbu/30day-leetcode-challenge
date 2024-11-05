import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] num1={4,9,5};
        int[] num2 ={9,4,9,8,4};
        System.out.println("output: "+ Arrays.toString(intersection(num1, num2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
//        int len1=nums1.length;
//        int len2= nums2.length;
//        // sort both the array
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//        int pointer1=0;
//        int pointer2=0;
//        System.out.println("num1: "+ Arrays.toString(nums1));
//        System.out.println("num2: "+ Arrays.toString(nums2));
//        HashSet<Integer> odd = new HashSet<>();
//        while (pointer1<len1 && pointer2 <len2){
//            if(nums1[pointer1]==nums2[pointer2]){
//                odd.add(nums1[pointer1]);
//                System.out.println(odd);
//                pointer1++;
//                pointer2++;
//            }else if(nums1[pointer1]>nums2[pointer2]){
//                pointer2++;
//            }else{
//                pointer1++;
//            }
//        }
//        int[] result= new int[odd.size()] ;
//        int count=0;
//
//        for(int i : odd){
//            result[count++]=i;
//        }
//        return result;
        //hashset to store unique value from num1
        HashSet<Integer> unique1= new HashSet<>();
        for (int num: nums1){
            unique1.add(num);
        }
        ArrayList<Integer> holdResult = new ArrayList<>();
        int count=0;
        for (int num : nums2){
            if(unique1.contains(num)){
                if (!holdResult.contains(num) ) {
                    holdResult.add(num);
                }

                System.out.println("hold: "+ holdResult);
                unique1.remove(num);
            }
        }
        while(nums1.length < nums2.length){

        }
        int[] result=new int[holdResult.size()];
        System.out.println();
        for(int i=0; i < result.length;i++){
            result[i]= holdResult.get(i);
        }
        return  result;
    }
}