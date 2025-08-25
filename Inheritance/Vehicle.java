public class Vehicle {
    String color;
    double weight;
    public Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    void display(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
