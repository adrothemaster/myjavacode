package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Murodil";
        p1.age = 38;

        p1.talk();
        p1.walk();
        p1.work("DEV MASTER");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;

    }
}
