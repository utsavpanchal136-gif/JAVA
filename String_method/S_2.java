package String_method;

import java.util.Scanner;

public class S_2 {
    public static void main(String[] args) {

        // substring() = A method used to extract a portion of a string
        //                       .substring(start,end)
        Scanner scanner = new Scanner(System.in);
        String email , username , domain ;

        System.out.print("Enter your email : ");
        email = scanner.next();

        if (email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Email must contains @");
        }
        scanner.close();
    }
}
