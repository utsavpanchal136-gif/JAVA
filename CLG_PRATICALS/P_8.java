package CLG_PRACTICALS;

class University {

    // Static data member
    static int totalStudents;

    // Static variable
    static String universityName;

    // Static block
    static {
        universityName = "Gujarat Technical University";
        System.out.println("Static Block Executed");
    }

    // Instance block
    {
        System.out.println("Instance Block Executed");
    }

    // Constructor
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }
}


public class P_8 {
    public static void main(String[] args) {

            System.out.println("Main Method Started");

            University s1 = new University();
            University s2 = new University();

            System.out.println("Total Students: " + University.getTotalStudents());
        }
}
