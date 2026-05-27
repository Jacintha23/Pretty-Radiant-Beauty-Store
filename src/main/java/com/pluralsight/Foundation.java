package com.pluralsight;

public class Foundation extends Order
{
    private String quality; //Standard or Luxury

    // Sizes in fl oz
    private double size;
    private double travelSize = 0.5;
    private double standardSize = 1.0;
    private double valueSize = 2.0;

    // Standard prices
    private double sTravelPrice = 5.00;
    private double standardPrice = 10.00;
    private double sValuePrice = 15.00;

    // Luxury prices
    private double luxeTravelPrice = 15.00;
    private double luxeStandardPrice = 30.00;
    private double luxeValuePrice = 45.00;

    // Shades
    private String shade;
    private String form;
    private String finish;
    private String skinType;
    private boolean fragrance;
    private boolean cruelty;

    public Foundation(String quality, double size, double travelSize, double standardSize,
                      double valueSize, double sTravelPrice, double standardPrice, double sValuePrice,
                      double luxeTravelPrice, double luxeStandardPrice, double luxeValuePrice, String shade,
                      String form, String finish, String skinType, boolean fragrance, boolean cruelty)
    {
        this.quality = quality;
        this.size = size;
        this.travelSize = travelSize;
        this.standardSize = standardSize;
        this.valueSize = valueSize;
        this.sTravelPrice = sTravelPrice;
        this.standardPrice = standardPrice;
        this.sValuePrice = sValuePrice;
        this.luxeTravelPrice = luxeTravelPrice;
        this.luxeStandardPrice = luxeStandardPrice;
        this.luxeValuePrice = luxeValuePrice;
        this.shade = shade;
        this.form = form;
        this.finish = finish;
        this.skinType = skinType;
        this.fragrance = fragrance;
        this.cruelty = cruelty;
    }

    public String getQuality() {
        return quality;
    }

    public double getSize() {
        return size;
    }

    public double getTravelSize() {
        return travelSize;
    }

    public double getStandardSize() {
        return standardSize;
    }

    public double getValueSize() {
        return valueSize;
    }

    public double getsTravelPrice() {
        return sTravelPrice;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public double getsValuePrice() {
        return sValuePrice;
    }

    public double getLuxeTravelPrice() {
        return luxeTravelPrice;
    }

    public double getLuxeStandardPrice() {
        return luxeStandardPrice;
    }

    public double getLuxeValuePrice() {
        return luxeValuePrice;
    }

    public String getShade() {
        return shade;
    }

    public String getForm() {
        return form;
    }

    public String getFinish() {
        return finish;
    }

    public String getSkinType() {
        return skinType;
    }

    public boolean isFragrance() {
        return fragrance;
    }

    public boolean isCruelty() {
        return cruelty;
    }
}
