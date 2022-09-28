public class Circle {

    // instance variables
    private double radius;

    // constructor
    public Circle(double rad) {
        radius = rad;
    }

    // method to print area
    public void printArea() {
        double area = 3.14 * radius * radius;
        System.out.println("My area is: " +  area);
    }
}

