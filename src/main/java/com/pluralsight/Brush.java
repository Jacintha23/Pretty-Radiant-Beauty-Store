package com.pluralsight;

public class Brush extends Order
{
    // Brush size in inches
    private double standardBSize = 6.0;

    // Brush price
    private double standardBPrice = 10.00;

    public Brush(double standardBSize, double standardBPrice)
    {
        this.standardBSize = standardBSize;
        this.standardBPrice = standardBPrice;
    }


    public double getStandardBSize() {
        return standardBSize;
    }

    public double getStandardBPrice() {
        return standardBPrice;
    }
}
