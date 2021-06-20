package Day42_arrayLlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a");words.add("input");words.add("title");

        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
    }


    public static void printStrList(List<String> strings) {
        for (String str : strings){
            System.out.print(str +  " ");
        }
        System.out.println();
    }
}
