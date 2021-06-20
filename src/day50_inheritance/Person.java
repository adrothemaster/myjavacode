package day50_inheritance;

public class Person {

    String name;
    int age;

    public void walk() {
        System.out.println("is walking");
    }
    public void talk(){
        System.out.println("is talking");
    }
    public void work(String job) {
        System.out.println("is working as " + job);
    }
}
