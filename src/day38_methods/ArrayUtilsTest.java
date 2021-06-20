package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23 ,56, 22, 3};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {2,45,32,15,68,94,35,3,7,55,46});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[] {1,2,3,4,5,6,7,8,9,10}));

        int [] nums1 = {1,5,8,9,6,4};
        System.out.println("9 - contains = " + ArrayUtils.contains(nums1, 9));
        System.out.println("8 - contains = " + ArrayUtils.contains(nums1, 8));
        System.out.println("2 - contains = " + ArrayUtils.contains(nums1, 2));
    }
}

