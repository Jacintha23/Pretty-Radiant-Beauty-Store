package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static Scanner scanner;
    static ArrayList<Order> orders;


    public Main()
    {
    }
   public static void main(String[] args)
    {
    HomeScreen();
    }
    public static void HomeScreen() {
        while(true)
        {
            System.out.println("Hello Beautiful! What brings you in today?");
            System.out.println("1) New Order");
            System.out.println("0) Exit the application");
            switch (scanner.nextLine().toUpperCase())
            {
                case "1":
                addNewOrder();
                break;

            }
        }
    }


    public static void addNewOrder()
    {   // Intro and quality options
        System.out.println("Let's build your perfect foundation!");
        System.out.println("Select a quality preference: ");
        System.out.println("S) Standard or L) Luxury"); //Display prices for choice
        String qualityChoice = scanner.nextLine();
        // Size options. Price is directly affected by size option (use if loop)
        System.out.println("Select your desired size: ");
        System.out.println("T) Travel 0.5 fl oz, " +
                           "S) Standard 1.0 fl oz" +
                           "V) Value 2.0 fl oz"); //display prices for choice
        String sizeChoice = scanner.nextLine();
        // Shade options
        System.out.println("Select your desired shade: ");
        System.out.println("F) Fair" +
                "M) Medium" +
                "D) Dark" +
                "DE) Deep");
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

        //switch (scanner.nextLine().toUpperCase())
    }











}
