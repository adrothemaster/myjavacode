package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("warming up and starting exercise");
    }
    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);

}
