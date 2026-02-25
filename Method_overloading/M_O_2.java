package Method_overloading;

public class M_O_2 {
    public static void main(String[] args) {
        String pizaa = bakePizaa("flat bread" , "mozzarella" , "pepperoni");
        System.out.println(pizaa);
    }

    static String bakePizaa(String bread ){
        return bread + " pizaa";
    }

    static String bakePizaa(String bread ,String cheese ){
        return cheese + " " + bread + " pizaa";
    }

    static String bakePizaa(String bread ,String cheese , String topping ){
        return topping + cheese + " " + bread + " " +  " pizaa";
    }

}
