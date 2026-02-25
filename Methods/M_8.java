package Methods;

public class M_8 {
    // varargs (variable arguments)

    public static void main(String[] args) {
        printnumber();
        printnumber(5);
        printnumber(1,2,3,4);
    }

    public static void printnumber(int... number){
        for (int num : number){
            System.out.println(num);
        }
    }
}
