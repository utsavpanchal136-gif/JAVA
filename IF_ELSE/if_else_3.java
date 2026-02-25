package if_else;

import java.util.Scanner;

public class if_else_3 {
    static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.print("Enter value of c: ");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater than b and c");
            }
            else{
                System.out.println("c is greater than a and b");
            }
        }
        else{
            System.out.println("b is grater than a and c");
        }
    }
}
