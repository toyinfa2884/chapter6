package chapterSix;

import java.util.Scanner;

public class MaximumValue {
    public  static double maximum( double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue)
            maximumValue = y;
        if (z > maximumValue)
            maximumValue = z;
        return maximumValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating-point values separated by spaces:");
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();

        double result = maximum(value1, value2, value3);
        System.out.println("Maximum value is: " + result);
        }

}
