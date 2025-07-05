package lesson1;

//672115039 Metavee Aeinjang

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UniData {
    public static void main(String[] args) {
        try {
            Scanner filePath = new Scanner(System.in);
            System.out.println("Input file path: ");
            String path = filePath.nextLine();
            File f = new File(path);
            FileWriter myWriter = new FileWriter(f, true);
            myWriter.append("\n571,601-650,Chiang Mai University,TH,Thailand,XL,FC,HI,4,A,33.8,256,19.3,466,16.4,701+,3.9,701+,5.1,701+,4.1,701+,20.9,538,17.1,495,59.2,252=,20.7");
            myWriter.close();
            System.out.println("Success writing");
        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        }
    }
}