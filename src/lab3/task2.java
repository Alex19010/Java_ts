import java.util.Scanner;

public class Radius {

    public static class Circle {
        private double radius;
        private static int numOfObjects = 0;

        public Circle(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be negative");
            }
            this.radius = radius;
            numOfObjects++;
        }

        public double getRadius() {
            return radius;
        }

        public static int getNumOfObjects() {
            return numOfObjects;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();

            Circle circle = null;
            try {
                circle = new Circle(radius);
                System.out.println("Circle created with radius: " + circle.getRadius());
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            if (circle != null) {
                System.out.println("Number of objects created: " + Circle.getNumOfObjects());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
