package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "i am the most intelligent person in the whole planet my name is adrien";
        char letter = 'a';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("there are " + count + " " +letter + "'s in sentence above");
    }
}
