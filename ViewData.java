package org.example;

import java.util.ArrayList;
import java.io.PrintWriter;

public class ViewData {

    public void PrintTheSortedList(ArrayList<Tshirt> TshirtList)
    {
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("<------T-Shirts We Have According To Your Search Are------>");
        writer.println();
        for(Tshirt t :TshirtList)
        {
            writer.println("|Id|-> "+t.getId()+"  |Name|-> "+t.getName()+"  |Color|-> "+t.getColor()+"  |Price|-> "+t.getPrice()+" |Rating|-> "+t.getRating()+" |Size|-> "+t.getSize()+" |Availability|-> "+t.getAvailability());
            writer.println();

        }
        writer.flush();
        writer.close();
    }
}
