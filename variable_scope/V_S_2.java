package variable_scope;

public class V_S_2 {

    static int x = 3; // class

    public static void main(String[] args) {
        int x = 1; // local

        System.out.println(x);
        dosoemething();
    }
    static void dosoemething (){
        int x = 2; // local
        System.out.println(x);
    }
}
