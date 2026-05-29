package com.pluralsight;

import java.math.BigDecimal;
import java.util.Locale;

public class Foundation extends Order
{
    private String quality; //Standard or Luxury

    // Sizes in fl oz
    private String size;
    private double travelSize = 0.5;
    private double standardSize = 1.0;
    private double valueSize = 2.0;

    // Standard prices
    private double sTravelPrice = 5.00;
    private double standardPrice = 10.00;
    private double sValuePrice = 15.00;

    // Luxury add on prices
    private double luxeTravelPrice = 15.00;
    private double luxeStandardPrice = 30.00;
    private double luxeValuePrice = 45.00;

    private String shade;
    private String form;
    private String finish;
    private String skinType;
    private String fragrance; // with Fragrance premium option
    //private boolean cruelty;

    public Foundation(String quality, String size, String shade,
                      String form, String finish, String skinType,
                      String fragrance)
    {
        this.quality = quality;
        this.size = size;
        this.shade = shade;
        this.form = form;
        this.finish = finish;
        this.skinType = skinType;
        this.fragrance = fragrance;
    }

    public String getQuality() {
        return quality;
    }

    public String getSize()
    {
        return size;
    }

    public double getTravelSize()
    {
        return travelSize;
    }

    public double getStandardSize()
    {
        return standardSize;
    }

    public double getValueSize()
    {
        return valueSize;
    }

    public double getsTravelPrice()
    {
        return sTravelPrice;
    }

    public double getStandardPrice()
    {
        return standardPrice;
    }

    public double getsValuePrice()
    {
        return sValuePrice;
    }

    public double getLuxeTravelPrice()
    {
        return luxeTravelPrice;
    }

    public double getLuxeStandardPrice()
    {
        return luxeStandardPrice;
    }

    public double getLuxeValuePrice()
    {
        return luxeValuePrice;
    }

    public String getShade()
    {
        return shade;
    }

    public String getForm()
    {
        return form;
    }

    public String getFinish()
    {
        return finish;
    }

    public String getSkinType()
    {
        return skinType;
    }

    public String isFragrance()
    {
        return fragrance;
    }

    @Override
    public double getTotal()
    {
        double total = 0;
        //Size
        switch(size.toUpperCase())
        {
            case "T":
                if(quality.toUpperCase().equals("L"))
                {
                    total += luxeTravelPrice;
                }
                else
                {
                    total += sTravelPrice;
                }
                break;
            case "S":
                if(quality.toUpperCase().equals("L"))
                {
                    total += luxeStandardPrice;
                }
                else {
                    total += standardPrice;
                }
                break;
            case "V":
                if(quality.toUpperCase().equals("L"))
                {
                    total += luxeValuePrice;
                }
                else {
                    total += sValuePrice;
                }
                break;
        }

        return total;

    }

    public String toString()
    {
        // Convert quality code to readable label
        String qualityLabel = quality.toUpperCase().equals("L") ? "Luxury" : "Standard";

        // Convert size code to readable label
        String sizeLabel;
        switch(size.toUpperCase())
        {
            case "T": sizeLabel = "Travel (0.5 fl oz)"; break;
            case "S": sizeLabel = "Standard (1.0 fl oz)"; break;
            case "V": sizeLabel = "Value (2.0 fl oz)"; break;
            default:  sizeLabel = size;
        }

        return "Foundation | " +
                qualityLabel + " | " +
                sizeLabel + " | " +
                "Shade: " + shade + "\n" +
                "Form: " + form + " | " +
                "Finish: " + finish + " | " +
                "Skin Type: " + skinType +  "\n" +
                "Fragrance: " + fragrance + " | " +
                "Price: $" + String.format("%.2f", getTotal());
    }




}
