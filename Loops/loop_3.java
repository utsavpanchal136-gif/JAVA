package loop;


public class loop_3 {
    public static void main(String[] args) {

        System.out.println("A 'for' loop that counts from 5 to 15 in increment of 2:");
        for (int i = 5; i <= 15; i += 2) {
            System.out.println(i);
        }

        System.out.println("A 'for' loop that counts down from 10 to 1");
        for (int i = 10; i>=1 ; i--){
            System.out.println(i);
        }

        System.out.println("A 'for' loop that prints out the frist 10 even number");
        for (int i = 2; i<=20; i +=2){
            System.out.println(i);
        }
        System.out.println("A 'for' loop that calculation the factorial of a given number :");



        int num = 5;
        int factorial = 1;
        for (int i =1 ; i <= num ; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is : " + factorial);
    }
}
