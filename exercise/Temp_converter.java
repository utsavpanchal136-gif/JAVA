package Bro_code_videos;

import java.util.Scanner;

public class Temp_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temp,newtemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.println("In this calculator if you enter c then it means your value must be in fahrenheit and vice versa !! ");
        System.out.print("convert to celsius or Fahrenheit? (C or F) : ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9  : (temp * 9 / 5) + 32;
        System.out.printf("%.1f° %s" , newtemp , unit); // for degree symbol alt + 0176


        scanner.close();
    }
}
