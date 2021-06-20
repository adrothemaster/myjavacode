package day45_oop;

public class TrafficLightsObject {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";  // not good practice!!!
        // we will assign/ update the value of color using a method of the class
        trafficLight.changeColor("red");
        trafficLight.displayColor();

        trafficLight.changeColor("green");
        trafficLight.displayColor();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("yellow");
        trafficLight1.displayColor();
    }
}
