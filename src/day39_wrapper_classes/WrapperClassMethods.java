package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 30));
        System.out.println(Integer.min(35, 12));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.max(245.2, 299.3));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Double.compare(4, 5));
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 6));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("is uppercase");
        }
        String word = "JAva Is Fun";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));

            }
        }

    }
}
