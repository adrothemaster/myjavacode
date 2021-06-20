package day45_oop;

public class TrafficLight {
    String color;
    // this is read only method displays value
    public void displayColor() {
        System.out.println("current color = " + color);
    }
    // this method updates the value
    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")) {
        System.out.println("changing color to " + newColor);
        color = newColor;

        }else{
            System.out.println("error: invalid color");
        }
    }

}
