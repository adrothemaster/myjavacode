package day43_list_custom_classes;

public class Person {

    // this is considered a Template

    String firstName;
    int age;
    char gender;

    public void speak () {
        System.out.println("person is speaking");
    }
}

class people {
    public static void main(String[] args) {
        // create object from person class -> instantiate person class
        Person person1 = new Person();
        person1.firstName = "bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "mike";
        person2.age = 22;
        person2.gender = 'M';
        person2.speak();
        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}
