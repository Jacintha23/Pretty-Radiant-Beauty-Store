package com.pluralsight;

public class Brush extends Order
{
    // Brush size in inches
    private String brushSize;
    private double standardBSize = 6.0;

    // Brush price
    private double standardBPrice = 10.00;

    public Brush(String brushSize)
    {
        this.brushSize = brushSize;
    }


    public String brushSize()
    {
        return brushSize;
    }

    public double standardBSize()
    {
        return standardBSize;
    }

    public double standardBPrice()
    {
        return standardBPrice;
    }

    public double getTotal()
    {
        double total = 0;

        switch(brushSize.toUpperCase())
        {
            case "S":
                total =+ standardBPrice;
                break;
        }
        return total;
    }

    public String toString()
    {
        // public Brush(String brushSize)
        return this.brushSize + " | " +this.getTotal();
    };
}

