package String_method;

public class S_1 {
    public static void main(String[] args) {
        // use in password checking for ex password is compulsory 12 character
        String name = "Password";

        int length = name.length();

        // for checking which letter is which position
        char letter = name.charAt(4);
        int index = name.indexOf("k");

        // for uppercase
        //name = name.toUpperCase();

        // remove the white space
        name = name.trim();

        // replace the character
        name = name.replace("_" , " ");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);

        // check string is empty or not
        /*if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }
        */

        // password checker
        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("password level is medium");
        }
    }
}
