package CLG_PRACTICALS;

class Time {

    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    void addTime(Time t1, Time t2) {

        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;

        if (minutes >= 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
    }
}

public class P_4 {

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(4, 17);
        t2.setTime(8, 40);

        result.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Added Time: ");
        result.displayTime();
    }
}