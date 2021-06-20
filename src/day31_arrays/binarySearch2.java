package day31_arrays;

import java.util.*;

public class binarySearch2 {
    public static void main(String[] args) {
        int[] nums = {-5 ,23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); //1
        System.out.println(Arrays.binarySearch(nums, 2344));//4
        System.out.println(Arrays.binarySearch(nums, 25)); //-3
        System.out.println(Arrays.binarySearch(nums, 700)); //-5
        System.out.println(Arrays.binarySearch(nums, -5)); //0

        //check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");


            int[] nums1 = {4, 5, 2, 10};
            int[] nums2 = {4, 5, 2, 10};
            int[] nums3 = {10, 4, 5, 2};
            int[] nums4 = {4, 5, 2, 10, 90};
            int[] nums5 = {54, 23, 54, 123, 54};

            String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
            String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
            String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
            String[] cars4 = {"Toyota","Honda", "Tesla"};

            System.out.println("nums1 nums2");
            if (Arrays.equals(nums2, nums1)) {
                System.out.println("nums1 and nums2 match");
            }


        }
    }
}