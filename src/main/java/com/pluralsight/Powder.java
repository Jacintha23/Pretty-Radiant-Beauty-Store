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


}



