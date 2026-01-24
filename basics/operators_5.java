public class operators_5 {
    static void main() {
        int a = 15;
        int b = 5;

        // Perform arithmetic operations
        int additionResult = a + b; // Addition of a and b
        int subtractionResult = a - b;
        int multiplicationResult = a * b;
        int divisionResult = a / b;
        int remainderResult = a % b;

        // Perform comparison operations
        boolean isEqual = a == b; // Check if a is equal to b
        boolean isNotEqual = a!= b;
        boolean isGreaterThan = a>b;
        boolean isLessThan = a<b;
        boolean isGreaterOrEqual = a>=b;
        boolean isLessOrEqual = a<=b;

        // Perform logical operations
        boolean andResult = a>0 && b>0;
        boolean orResult = a>0 || b>0;
        boolean notResult = !(a >0);

        // Perform assignment operations
        int x = a;
        x += b;

        int y = a;
        y -= b;

        int z = a;
        z *= b;

        int assign = a;
        assign *= b;



        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Remainder: " + remainderResult);

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);

        System.out.println("Assignment Operations Result: " + assign);
    }
    }

