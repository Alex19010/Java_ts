public class Circle {

    public static void main(String[] args) {
        try {
            int numberOfObjects = createCircles(5, 5, 0);
            System.out.println("Number of objects created: " + numberOfObjects);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int createCircles(double... radii) throws InvalidRadiusException {
        int count = 0;

        for (double radius : radii) {
            new CircleWithCustomException(radius);
            count++;
        }

        return count;
    }
}

class CircleWithCustomException {

    private static int numberOfObjects = 0;

    public CircleWithCustomException(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException("Invalid radius: radius cannot be negative");
        }
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

}

class InvalidRadiusException extends Exception {

    public InvalidRadiusException(String message) {
        super(message);
    }
}