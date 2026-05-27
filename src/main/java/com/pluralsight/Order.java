package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

public class Order
{
        // Create List for order items (sandwiches, drinks, and chips)
        private List<Foundation> foundations;
        private List<Powder> powders;
        private List<Brush> brushes;
        // Store total price
        private double totalPrice;

        // Constructor: initialize the class properties
    public Order()
    {
            this.foundations = new ArrayList<>();
            this.powders = new ArrayList<>();
            this.brushes = new ArrayList<>();
            this.totalPrice = 0;
    }

    private void updateTotal()
    {
        totalPrice = 0;

        for (Foundation foundation : foundations)
        {
            totalPrice += (foundation.getTotal());
        }

        for (Powder powder : powders)
        {
        //    totalPrice = totalPrice.add(powder.getPrice());
        }

        for (Brush brush : brushes)
        {
        //    totalPrice = totalPrice.add(brush.getPrice());
        }
    }



        // addSandwich method: add sandwich to list
        public void addFoundation (Foundation foundation)
        {
            foundations.add(foundation);                                            //foundations.add(foundation);
            updateTotal();
        }

        // addDrink method: add drink to list
        public void addPowder (Powder powder)
        {
            powders.add(powder);
            updateTotal();
        }

        // addChips method: add chips to list
        public void addBrush (Brush brushes)
        {
            this.brushes.add(brushes);
            updateTotal();
        }

        // getTotal method: return total price of order
        public double getTotal ()
        {
            return totalPrice;
        }



}
