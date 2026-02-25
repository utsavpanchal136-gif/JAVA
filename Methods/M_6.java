package Methods;

public class M_6 {
    // pass by reference
    static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println("Before calling the method number[0] =  " + num[0]);
        changeArray(num);
        System.out.println("After calling the method number[0] =  " + num[0]);

    }

    public static void changeArray(int[] array){
        array[0] = array[0] + 10;
        System.out.println("Inside the method , array[0] = " + array[0]);
    }
}
