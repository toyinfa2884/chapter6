package chapterSix;

import java.util.Scanner;

public class CardValidation {

    //private static long cardNumber;
    //private static String cardType;
    public static void main(String[] args) {
        System.out.println("Enter your credit card number as an integer.");
        Scanner input = new Scanner(System.in);
        long cardNumber = input.nextLong();
        System.out.println(cardNumber + " is " + (isValid(cardNumber) ? "valid" : "invalid"));
    }

    public static boolean isValid(long cardNumber){
        boolean valid = (getSize(cardNumber) >= 13 && getSize(cardNumber) <= 16) &&
        (prefixMatched(cardNumber, 4) || prefixMatched(cardNumber, 5) || prefixMatched(cardNumber, 37) ||
                prefixMatched(cardNumber, 6)) &&
                ((sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber) % 10 == 0));
        return valid;
    }

    public static int sumOfDoubleEvenPlace(long cardNumber) {
        int sum = 0;
        int number = getSize(cardNumber) - 2;
        while (number >= 0){
            int doubleValue = getDigit((int) cardNumber);
            sum = sum + doubleValue * 2;
            number -= 2;

        }
        return sum;
    }

    public static int getDigit(int cardNumber) {
        if(cardNumber < 9)
            return cardNumber;
        else
            return cardNumber % 10 + cardNumber / 10;
    }

    public static int sumOfOddPlace(long cardNumber) {
        int sum = 0;
        int number = getSize(cardNumber) - 1;
        while (number >= 0){
            int doubleValue = ((int) cardNumber);
            sum = sum + doubleValue;
            number -= 2;
        }
        return sum;

    }

    public static boolean prefixMatched(long cardNumber, int d) {
        return getPrefix(cardNumber, getSize(d)) == d;

    }

    public static int getSize(long d) {
        String number = d + "";
        return number.length();
    }

    public static long getPrefix(long cardNumber, int k) {
        if(getSize(cardNumber) > k){
            String number = cardNumber + "";
            return Integer.parseInt(number.substring(0,k));
        }
        return cardNumber;
    }


}
