package Method_overloading;

public class M_O_1 {
    public static void main(String[] args) {

        // overloaded methods = methds that share the same name
        //                        but different parameters
        //                        signature = name + parameters

        System.out.println(add(3,2,5));
    }

    public static double add(double a,double b){
        return a + b;
    }

    public static double add(double a,double b,double c){
        return a + b + c;
    }

}
