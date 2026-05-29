package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

public class Order
{
        // Create List for order items
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

    public List<Foundation> foundations()
    {
        return foundations;
    }

    public void setFoundations(List<Foundation> foundations) {
        this.foundations = foundations;
    }

    public List<Powder> powders() {
        return powders;
    }

    public void setPowders(List<Powder> powders) {
        this.powders = powders;
    }

    public List<Brush> brushes() {
        return brushes;
    }

    public void setBrushes(List<Brush> brushes) {
        this.brushes = brushes;
    }

    public double totalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private void updateTotal()
    {
        totalPrice = 0;

        for (Foundation foundation : foundations)
        {
            totalPrice += foundation.getTotal();
        }

        for (Powder powder : powders)
        {
         totalPrice += powder.getTotal();
        }

        for (Brush brush : brushes)
        {
          totalPrice += brush.getTotal();
        }
    }

        // add methods

        // addFoundation method: add foundation to list
        public void addFoundation (Foundation foundation)
        {
            foundations.add(foundation);                                            //foundations.add(foundation);
            updateTotal();
        }


        public void addPowder (Powder powder)
        {
            powders.add(powder);
            updateTotal();
        }


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
