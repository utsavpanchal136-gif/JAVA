package Methods;

public class M_4 {

    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(add(5.0, 7.0));

        String fullname = getfullname("Utsav", "Panchal");
        System.out.println(fullname);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String getfullname(String first, String last) {
        return first + " " + last;
    }
}
