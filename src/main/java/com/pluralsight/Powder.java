package com.pluralsight;

public class Powder extends Order
{
    // Sizes in oz
    private String powderSize;
    private double travelPSize = 0.25;
    private double standardPSize = 1.0;

    // Prices
    private double travelPPrice = 10.00;
    private double standardPPrice = 15.00;

    // Possible quality option for powders...

    public Powder(String powderSize)
    {
        this.powderSize = powderSize;
    }

    public String powderSize()
    {
        return powderSize;
    }

    public double travelPSize()
    {
        return travelPSize;
    }

    public double standardPSize()
    {
        return standardPSize;
    }

    public double travelPPrice()
    {
        return travelPPrice;
    }

    public double standardPPrice()
    {
        return standardPPrice;
    }

    @Override
    public double getTotal()
    {
        double total = 0;
        //Size
        switch(powderSize.toUpperCase())
        {
            case "T":
                total += travelPPrice;
                break;
            case "S":
                total += standardPPrice;
                break;
        }

        return total;

    }

    @Override
    public String toString()
    {
        String sizeLabel;
        switch(powderSize.toUpperCase())
        {
            case "T": sizeLabel = "Travel (0.25 oz)"; break;
            case "S": sizeLabel = "Standard (1.0 oz)"; break;
            default:  sizeLabel = powderSize;
        }

        return "Powder | " +
                "Size: " + sizeLabel + " | " +
                "Price: $" + String.format("%.2f", getTotal());
    }


}



