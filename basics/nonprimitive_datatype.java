public class nonprimitive_datatype {
    static void main() {
        /*
        Non primitive data type
        string
        arrays
        classes
         */

        int primitive =5;
        String nonprimitive = new String("Hello");
        System.out.println("primitive data type : " +primitive);
        System.out.println("nonprimitive data type : " +nonprimitive);

        int[] myArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
