package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> nums2 = getIntegerList();
        long end = System.nanoTime();
        double secondsAL = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList time = " + secondsAL);

        long st = System.nanoTime();
        int[] arr = getIntergerArray();
        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time = " + seconds);


        // System.out.println(nums2);

    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;
    }
    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */

    public static int[] getIntergerArray () {
        int [] nums = new int [1000_001];
        for (int i = 0; i <+ 1_000_000 ; i++) {
            nums[i] = i;
        }
        return nums;
    }

}
