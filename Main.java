package org.example;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int Preference;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Color of T-shirt : ");
        String Color = sc.nextLine().toUpperCase();
        
        System.out.print("Enter Your Gender : ");
        String Gender = sc.next().toUpperCase();

        System.out.print("Enter the Size : ");
        String Size = sc.next().toUpperCase();

        System.out.print("Press 1 To Sort By Price\n"+"Press 2 To Sort By Rating\n"+"Press 3 To Sort By Price and Rating\n"+"Enter Your Choice : ");
        Preference = sc.nextInt();
        System.out.println();

        CsvFileReader csvFl = new CsvFileReader();

        String directoryPath = "/Users/macbook/Downloads";
        File[] filesInDirectory = new File(directoryPath).listFiles();
        for(File f : filesInDirectory){
            String filePath = f.getAbsolutePath();
            String fileExtenstion = filePath.substring(filePath.lastIndexOf(".") + 1,filePath.length());
            if("csv".equals(fileExtenstion)){
                csvFl.readCsvFile(filePath,Color,Gender,Size);
            }
        }

        Collections.sort(csvFl.TshirtList, new SortByChoice());
        if(csvFl.TshirtList.isEmpty())
        {
            System.out.println();
            System.out.println("Tshirt Not Available");
        }
        else {
            ViewData v = new ViewData();
            v.PrintTheSortedList(csvFl.TshirtList);
        }
    }
}