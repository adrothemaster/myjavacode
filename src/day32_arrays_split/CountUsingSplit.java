package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String [] noCats = cats.split("cat");
        System.out.println("count with no cats = " + (noCats.length - 1));

        for (String type : noCats) {
            System.out.print(type);
        }
    }
}
