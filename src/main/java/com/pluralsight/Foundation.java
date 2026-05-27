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


    private String shade;
    private String form;
    private String finish;
    private String skinType;
    private boolean fragrance;
    private boolean cruelty;

    public Foundation(String quality, double size,
                      double price, String shade,
                      String form, String finish,
                      String skinType, boolean fragrance,
                      boolean cruelty)
    {
        this.quality = quality;
        this.size = size;
        this.price = price;
        this.shade = shade;
        this.form = form;
        this.finish = finish;
        this.skinType = skinType;
        this.fragrance = fragrance;
        this.cruelty = cruelty;
    }







}
