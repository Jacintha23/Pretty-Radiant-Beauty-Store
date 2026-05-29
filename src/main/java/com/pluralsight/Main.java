package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static ArrayList<Order> orders = new ArrayList<Order>();
    static Order currentOrder;


    public static void main(String[] args)
    {
        HomeScreen();
    }

    public static void HomeScreen() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Hello Beautiful! What brings you in today?");
            System.out.println("1) New Order");
            System.out.println("0) Exit the application");
            switch (scanner.nextLine().toUpperCase()) {
                case "1":
                    orderScreen();
                    break;
                case "0":
                    System.out.println("Have a nice day, until next time.");
                    return;
                default:
                    System.out.println("Uh oh! This selection is invalid, please try again.");
            }
        }
    }

    // Add second menu
    public static void orderScreen()
    {
        Scanner scanner = new Scanner(System.in);
        ReceiptWriter receiptWriter = new ReceiptWriter();
        currentOrder = new Order();

        while (true) {
            System.out.println("What would you like to order?");
            System.out.println("1) New foundation");
            System.out.println("2) New powder");
            System.out.println("3) New brush");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel order");
            switch (scanner.nextLine().toUpperCase()) {
                case "1":
                    addNewFoundationOrder();
                    break;
                case "2":
                    addNewPowderOrder();
                    break;
                case "3":
                    addNewBrushOrder();
                    break;
                case "4":
                    System.out.println("Checkout");
                    orders.add(currentOrder);
                    receiptWriter.saveReceipt(currentOrder);
                    return;
                case "0":
                    System.out.println("You have canceled your order.");
                    return;
                default:
                    System.out.println("Uh oh! This selection is invalid, please try again.");
            }
        }
    }


    public static void addNewFoundationOrder()
    {
        Scanner scanner = new Scanner(System.in);

        // Intro and quality options
        System.out.println("Let's build your perfect foundation!");
        System.out.println("Select a quality preference: ");
        System.out.println("S) Standard or L) Luxury"); //Display prices for choice
        String qualityChoice = scanner.nextLine();
        // Size options. Price is directly affected by size option (use if loop)
        System.out.println("Select your desired size: ");
        System.out.println("T) Travel 0.5 fl oz");
        System.out.println("Travel price: $5 " + "Luxury travel price: $15");
        System.out.println();
        System.out.println("S) Standard 1.0 fl oz");
        System.out.println("Standard price: $10 " + "Luxury standard price: $30");
        System.out.println();
        System.out.println("V) Value 2.0 fl oz");
        System.out.println("Value price: $15 " + "Luxury value price: $45");
        String sizeChoice = scanner.nextLine();
        // Shade options
        System.out.println(" Select your desired shade: ");
        System.out.println( " F) Fair " +
                            " M) Medium " +
                            " D) Dark " +
                            " DE) Deep");
        String shadeChoice = scanner.nextLine();
        // Form options
        System.out.println("Select a foundation formulation: ");
        System.out.println("L) Liquid or P) Powder");
        String formChoice = scanner.nextLine();

        // Finish options
        System.out.println("Select a finish: ");
        System.out.println("D) Dewy or M) Matte");
        String finishChoice = scanner.nextLine();

        // Skin-type choices
        System.out.println("What is your skin type?");
        System.out.println(("O) Oily, D) Dry or C) Combo"));
        String skinChoice = scanner.nextLine();

        //Fragrance choices - premium
        System.out.println("Select a fragrance option");
        System.out.println("F) Fragrance or FF) Fragrance-Free");
        String fragranceChoice = scanner.nextLine();

        // Instance of foundation
        Foundation foundation = new Foundation(qualityChoice, sizeChoice, shadeChoice, formChoice, finishChoice, skinChoice, fragranceChoice);
        currentOrder.addFoundation(foundation);
        System.out.println(foundation.getTotal());
    }

    public static void addNewPowderOrder()
    {
        Scanner scanner = new Scanner(System.in);
        // Powder size selection
        System.out.println("Please select a size for translucent powder");
        System.out.println(" T) Travel size 0.25 oz " +
                " S) Standard size 1.0 oz");
        String pSizeChoice = scanner.nextLine();

        //Instance of powder
        Powder powder = new Powder(pSizeChoice);
        currentOrder.addPowder(powder);
        System.out.println(powder.getTotal());
    }

    public static void addNewBrushOrder()
    {
        Scanner scanner = new Scanner(System.in);
        // Powder size selection
        System.out.println("Please choose an available option for a brush:");
        System.out.println(" S) Vegan Standard size 6.0 in");
        String bSizeChoice = scanner.nextLine();

        //Instance of brush
        Brush brush = new Brush(bSizeChoice);
        currentOrder.addBrush(brush);
        System.out.println(brush.getTotal());
    }

}