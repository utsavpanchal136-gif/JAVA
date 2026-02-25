package variable_scope;

public class V_S_1 {
    public static void main(String[] args) {

        // variable scope = where a variable can be accessed
        // 2 types :- local ,class
        // local = inside of a method declare variable is called local scope
        // class = declared inside of a class without any methods
        int x = 1; // local


        dosoemething();
    }
    static void dosoemething (){
        int x = 2; // local
        System.out.println(x);
    }
}
