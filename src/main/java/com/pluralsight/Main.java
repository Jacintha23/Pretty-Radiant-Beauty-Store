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
    homeScreen();
    }
    public static void homeScreen() {
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
    {




    }



}
