package day29_nestedloops_arrays;

public class ArraysIntroDetailedExamplesOf____ARRAYS {
    public static void main(String[] args) {
        int num = 10; // single variable
        int[] nums = new int[3]; // array variable
        // [3] above states can store 3 int values
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        // in java arrays are fixed size, must declare new array variable
        // in the array we have [5, 7, 10]
        // print values of array
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10
        i++;
        System.out.println(nums[i]); //7

        // how to find the size of array
        System.out.println("number of elements = " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array
        nums[0] = 100;
        nums[1] = 300;
        //read value of index [1] an assign same to index [2]
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);

        // how to declare values in the same statement... also 2nd way to declare
        int[] nums1 = {232,12,358,364,15986,456,1,69,7,13,12121,1000};
        System.out.println(nums1.length);
        System.out.println(nums1[0]);

        // and this is 3rd way but not very used
        double[] prices = new double[] {2.99,13.49,12.99,109.99};
        System.out.println("prices from shopping = " + prices[0] );

    }
}
