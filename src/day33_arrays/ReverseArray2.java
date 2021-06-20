package day33_arrays;
import java.util.*;
public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        int[] nums = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        System.out.println("after swap on [0] and [3]: " + Arrays.toString(nums)+"\n");

        int[] nums2 = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(nums2));

        for (int i = 0; i < nums2.length/2; i++){
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;

        }
        System.out.println("after swap: " + Arrays.toString(nums2)+ "\n");


        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words)+ "");

        for (int i = 0, j = words.length - 1; i < words.length/2; i++,j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("words after reverse = " + Arrays.toString(words));



        // int [] nums1 = {1,2,3,4,5,6,7,8,9,10};
        //System.out.println("before swap: " + Arrays.toString(nums1));
    }
}
