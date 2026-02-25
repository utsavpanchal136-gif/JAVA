package Methods;

public class M_3 {

    public static void main(String[] args) {
        addnumber(1, 5);

        // int sum = add(2, 3);
        //System.out.println("The sum is : " + sum);

        int multiplication = multiply(2, 3);
        System.out.println("The multiplication is : " + multiplication);
    }

    public static void addnumber(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }



    public static int multiply(int x, int y) {
        return x * y;
    }
}
