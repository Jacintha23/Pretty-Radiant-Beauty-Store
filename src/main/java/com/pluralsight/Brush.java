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


}
