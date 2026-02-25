package Switch;

public class switch_2 {
    static void main(String[] args) {
    int month = 5;
    String monthString;

    switch (month){

        case 1 : monthString = "January";
        break;

        case 2 : monthString = "February";
            break;

        case 3 : monthString = "March";
            break;

        case 4 : monthString = "April";
            break;

        case 5 : monthString = "may";
        break;

        default: monthString = "Invalid month";
            break;

        }
        System.out.println(monthString);
    }
}
