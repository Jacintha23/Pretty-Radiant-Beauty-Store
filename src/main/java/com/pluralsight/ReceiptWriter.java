package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter
{
    public void saveReceipt(Order order)
    {
        // generate filename using current date/time (yyyyMMdd-HHmmss.txt)
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String filename = "src/main/resources/Receipts"+ date.format(dtf) + ".txt";
        System.out.println(filename);
        // create a FileWriter and wrap in BufferedWriter (src/main/resources/receipts)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false)))
        {
            // loop through all order items
            // - write the items to the to receipt
            for(Foundation i : order.foundations()) // loop through al foundations and print
           {
              writer.write(i.toString());
              writer.newLine();
           }

            for(Brush i : order.brushes()) // loop through al foundations and print
            {
                writer.write(i.toString());
                writer.newLine();
            }

            for(Powder i : order.powders()) // loop through al foundations and print
            {
                writer.write(i.toString());
                writer.newLine();
            }
            // close BufferedWriter

           writer.close();
        } catch (IOException var6) {
            System.out.println("There was an error with this transaction.");
        }


        //write total cost


        // handle IOException with error message
    }

    private static String generateTimestamp()
    {
        // Create timestamp string using a formatter
        // return that string
        return "";
    }





}
