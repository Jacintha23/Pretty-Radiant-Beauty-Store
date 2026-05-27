package com.pluralsight;

public class Foundation extends Order
{
    private String quality;
    private double size;
    private double price;
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
