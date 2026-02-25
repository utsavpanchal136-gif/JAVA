package Methods;

public class M_5 {
    // pass by value
    static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling the method , x =  "+ x);
        changevalue(x);
        System.out.println("After calling the method , x =  "+ x);
    }

    public static void changevalue(int num){
        num = num + 10;
        System.out.println("Inside the method , num = "+ num);
    }
}

