package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        List<String> days = getdays();
        System.out.println(days);
        System.out.println("getdays().size() = " + getdays().size());
        System.out.println("getdays().get(0) = " + getdays().get(0));

        days.add("java day");
        System.out.println(days);

        days.removeIf(day -> day.length() == 6 );
        System.out.println("days after removeIF = " + days);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums after removeIf = " + nums);

    }


    public static List<String> getdays (){

        ArrayList<String> days = new ArrayList<>(Arrays.asList("monday" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday" , "sunday"));
        return days;
    }
    public static  List<Integer> getRandomList (int size) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            int n = random.nextInt(101);
            //if (!nums.contains(n)){
           //     nums.add(n);

            nums.add(random.nextInt(101));
        }
        return nums;
    }
}
