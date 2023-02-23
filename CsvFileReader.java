package org.example;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CsvFileReader{

ArrayList<Tshirt> TshirtList = new ArrayList<>();

    public void readCsvFile(String filename, String Color , String Gender,String Size) throws FileNotFoundException {
        File MyCsvFile = new File(filename);
        Scanner fc = new Scanner(MyCsvFile);
        while (fc.hasNext()) {
            String line = fc.nextLine().toUpperCase();

            if (!line.isEmpty()) {
                StringTokenizer token = new StringTokenizer(line, "|");
                 ArrayList<String> arr = new ArrayList<>(line.length());
                while (token.hasMoreTokens()) {
                    arr.add(token.nextToken());
                }
                if(arr.get(2).equals(Color)&&arr.get(3).equals(Gender)&&arr.get(4).equals(Size)&&arr.get(7).charAt(0)=='Y'){
                  Tshirt tshirt = new Tshirt(arr.get(0),arr.get(1),arr.get(2),arr.get(3),arr.get(4),Double.parseDouble(arr.get(5)),Float.parseFloat(arr.get(6)),arr.get(7));
                  TshirtList.add(tshirt);
                }
            }
        }
    }
}
