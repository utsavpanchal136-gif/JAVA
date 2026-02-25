package Methods;

public class M_2 {
    public static void main(String[] args) {
        printHello();
        printHello("Utsav");
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
