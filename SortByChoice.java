package org.example;
import java.util.Comparator;

public class SortByChoice implements Comparator<Tshirt> {


    public int compare(Tshirt o1, Tshirt o2) {
        if(Main.Preference==1)
        {
            if(o1.getPrice()>o2.getPrice())
                return 1;
            else if (o2.getPrice()>o1.getPrice())
                return -1;
            return 0;
        }
        else if (Main.Preference==2)
        {
            if(o1.getRating()<o2.getRating())
                return 1;
            else if(o2.getRating()<o1.getRating())
                return -1;
            return 0;
        }
        else if(Main.Preference==3)
        {
            if(o1.getPrice()<o2.getPrice()&&o1.getRating()>o2.getRating())
            {
                return 1;
            }
            else if(o2.getPrice()<o1.getPrice()&&o2.getRating()>o1.getRating())
            {
                return -1;
            }
            return 0;
        }
        return 0;
    }
}
