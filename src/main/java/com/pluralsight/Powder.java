package com.pluralsight;

public class Powder extends Order
{
    // Sizes in oz
    private double travelPSize = 0.25;
    private double standardPSize = 1.0;

    // Prices
    private double travelPPrice = 10.00;
    private double standardPPrice = 15.00;

    public Powder(double travelPSize, double standardPSize, double travelPPrice, double standardPPrice)
    {
        this.travelPSize = travelPSize;
        this.standardPSize = standardPSize;
        this.travelPPrice = travelPPrice;
        this.standardPPrice = standardPPrice;
    }

    public double getTravelPSize() {
        return travelPSize;
    }

    public double getStandardPSize() {
        return standardPSize;
    }

    public double getTravelPPrice() {
        return travelPPrice;
    }

    public double getStandardPPrice() {
        return standardPPrice;
    }


}



