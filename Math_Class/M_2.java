package Math_class;

import java.util.Scanner;

public class M_2 {
    public static void main(String[] args) {

        // HYPOTENUSE C = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) : " + c);

        scanner.close();
    }
}
