package Methods;

public class M_7 {
    // recursive Methods
    public static void main(String[] args) {
    int n = 4;
    int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is : " + factorial);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
