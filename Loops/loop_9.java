package loop;

import java.util.Scanner;

public class loop_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

          while(name.isEmpty()){
              System.out.print("Enter your name : ");
              name = scanner.nextLine();
          }
          // we use if insted of while then hello will be print
        System.out.println("HEllo " + name);

          scanner.close();
    }
}
