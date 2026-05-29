package com.pluralsight;

import java.io.File;
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
        File directory = new File("src/main/resources/Receipts");
        if (!directory.exists()) {
            directory.mkdirs(); //mkdirs is a method that creates a directory
        }

        String filename = "src/main/resources/Receipts/" + generateTimestamp() + ".txt";
        System.out.println(filename);

        // create a FileWriter and wrap in BufferedWriter (src/main/resources/receipts)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)))
        {
            // loop through all order items
            // - write the items to the receipt
            writer.write("-*-*-*-*-*-[ PRETTY RADIANT ]-*-*-*-*-*-");
            writer.newLine();
            writer.newLine();

            writer.write("-*-*-*-*-*-*-[ FOUNDATIONS ]-*-*-*-*-*-*-");
            writer.newLine();
            for (Foundation i : order.foundations()) // loop through all foundations and print
            {
                writer.write(i.toString());
                writer.newLine();
            }
            writer.newLine();

            writer.write("-*-*-*-*-*-*-[ BRUSHES ]-*-*-*-*-*-");
            writer.newLine();
            for (Brush i : order.brushes()) // loop through all brushes and print
            {
                writer.write(i.toString());
                writer.newLine();
            }
            writer.newLine();

            writer.write("-*-*-*-*-*-*-[ POWDERS ]-*-*-*-*-*-*-");
            writer.newLine();
            for (Powder i : order.powders()) // loop through all powders and print
            {
                writer.write(i.toString());
                writer.newLine();
            }
            writer.newLine();

            // write total cost
            writer.write("============================================");
            writer.newLine();
            writer.write("TOTAL: $" + order.getTotal());
            writer.newLine();
            writer.write("============================================");
            writer.newLine();

            // handle IOException with error message
        } catch (IOException e) {
            System.out.println("There was an error with this transaction.");
        }
    }

    private static String generateTimestamp()
    {
        // Create timestamp string using a formatter
        // return that string
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return LocalDateTime.now().format(dtf);
    }
    //NOTE: New transaction doesn't appear in receipt file UNTIL the program is rerun.
}
