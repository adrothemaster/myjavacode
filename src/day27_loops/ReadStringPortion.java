package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "car,cat,cat,red car,java,black car";

        for (int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i + 3));

            if (list.substring(i, i + 3).equals("car") || list.substring(i, i + 3).equals("cat")) {
                System.out.print("found");
            }
        }
            for (int i = 0; i < list.length()-2; i++) {
                String part = list.substring(i, i+3);
                System.out.println("part = " + part);

                if (list.substring(i, i+3).equals("car") || list.substring(i, i+3).equals("cat")) {
                    System.out.print("cat or car found ");


            }
        }
    }
}
