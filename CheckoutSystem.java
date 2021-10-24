package Assignments;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckoutSystem {
    public static Scanner collect = new Scanner(System.in);
    public static String repeat;
    public static int select;
    public static int quantity = 1;
    public static double payment;
    public static double price;
    public static double total = 0;
    public static void menu(){
        System.out.println("=".repeat(70));
        System.out.println("\t\t\t      MENU             ");
        System.out.println("Items");
        String menuPrompt = """
                1. Laptops
                2. Shoes
                3. iPhones
                4. Dettol Liquid Hand sanitizer
                5. Dettol Anti-Bacteria Soap
                6. Inverter
                """;
        System.out.println(menuPrompt);
    }

    public static void tableHeading(){
        System.out.println("JUHAMZ MALL");
        System.out.println("=".repeat(70));
        System.out.println("Locattion: Lagos");
        System.out.println("Tel:08033597157");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println("=".repeat(70));
    }

//    public static void tableToDisplayItems(){
//        String heading = String.format("%8s%8s%8s%8s%8s%8s%8s", "ITEMS", " ","QTY", " ","PRICE", " ","TOTAL");
//        System.out.println(heading);
//        System.out.println("-".repeat(70));
//    }
    public static void order(){
        System.out.println("Select the items you want to add to cart:");
        select = collect.nextInt();
        if(select == 1){
            System.out.println("Laptops");
            System.out.println("How many do you want?");
            quantity = collect.nextInt();
            System.out.println("Enter the price");
            price = collect.nextDouble();
            total = total + (quantity * price);

            System.out.println("Any other thing, Press Y for Yes and N for No:");

            repeat = collect.next();
            if(repeat.equalsIgnoreCase("Y")){
                order();
            }
            else{
                System.out.println("Make payment");
                payment = collect.nextDouble();
                if(payment <= total){
                    System.out.println("Payment is not enough");
                }
                else{
                    System.out.println("Total amount:" + total);
                    total = payment - total;
                    System.out.println("Change:" + total);
                }
            }
        }
    }


    public static void main(String[] args) {

        menu();
        tableHeading();
        //tableToDisplayItems();
        order();
    }
}
