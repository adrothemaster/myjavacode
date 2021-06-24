package day55_abstraction.exercise_example;

public class FreeWeights extends Lifting{
    @Override
    public void perform() {
        System.out.println("Lifting free weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
