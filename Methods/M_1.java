package Methods;

public class M_1 {

    public static void main(String[] args) {

        // method = a block of resuable code that is excuted when called()

        double radius = 3;
        double circleArea = calculateCircleArea(radius);
        System.out.println("Circle Area is : " + circleArea);
    }

    static double calculateCircleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
