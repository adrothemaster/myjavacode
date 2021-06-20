package Day42_arrayLlist;

import kotlin.collections.UCollectionsKt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');

        System.out.println("max char = " + Collections.max(letters));
        System.out.println("min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'A');
        Collections.replaceAll(letters, 'i', 'I');
        System.out.println("after replace = " + letters);

        Collections.sort(letters);
        System.out.println("sorted = " + letters);

        List<Integer> nums = Arrays.asList(23,3,45,23,65,28,67,19,49,86,75,22,8,6,32,23,19,55,59,84,61,78,37,1,36,1,24,23,28,67,94,21,19,37,2);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max num = " + max + "\nmin num = " + min);

        int countOfNum =  Collections.frequency(nums, 23);
        int countOfNum1 =  Collections.frequency(nums, 19);

        System.out.println("num 23 shows = " + countOfNum + "\nnum 19 shows = " + countOfNum1);

        Collections.replaceAll(nums, 2, 67);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("nums shuffled = " + nums);

    }
}
