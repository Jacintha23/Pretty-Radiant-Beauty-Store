package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkout
{
        private ArrayList<Foundation> foundations;
        private ArrayList<Powder> powders;
        private ArrayList<Brush> brushes;
        private Scanner scanner = new Scanner(System.in);

    public Checkout(ArrayList<Foundation> foundations, ArrayList<Powder> powders, ArrayList<Brush> brushes, Scanner scanner)
    {
        this.foundations = foundations;
        this.powders = powders;
        this.brushes = brushes;
        this.scanner = scanner;
    }




}
